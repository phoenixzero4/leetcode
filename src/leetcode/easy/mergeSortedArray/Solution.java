package leetcode.easy.mergeSortedArray;

import java.util.Arrays;

public class Solution {

    public static void merge(int[] nums1, int m, int[] nums2, int n){
	//int[] array = new int[m];
	System.arraycopy( nums1, 0,  nums1, 0, m );
	System.arraycopy( nums2, 0, nums1, m, n);
	
	
	Arrays.sort( nums1 );
	System.out.println(Arrays.toString( nums1));
	
    }
    
    public static void main(String...strings ){
	int[] a = {1,2,3,0,0,0};
	int m = 3;
	int[] b = {2,5,6};
	int n = 3;
	
	merge(a,m,b,n);
    }
    
}
