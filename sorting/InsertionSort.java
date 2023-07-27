package com.sorting;

import java.util.Arrays;

public class InsertionSort {
	public static void sort(int[] arr)
	{
		int length=arr.length;
		
		for(int i=1;i<length;i++)
		{
			int temp=arr[i];
			int j;
			for(j=i-1;j>=0 &&arr[j]>temp;j--)
			{
				arr[j+1]=arr[j];
			}
			arr[j+1]=temp;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 23, 45, 23, 45, 567, 5, 45, 3, 42, 27, 78 };
		// SelectionSort s=new SelectionSort();
		System.out.println("original array : " + Arrays.toString(arr));
		sort(arr);
		System.out.println("sorted array : " + Arrays.toString(arr));

	}


	
}
