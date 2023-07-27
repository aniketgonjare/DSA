package com.sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void sort(int[] arr)
	{
		int length=arr.length;
		
		for(int i=0;i<length-1;i++)
		{
			
			for(int j=0;j<length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
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


