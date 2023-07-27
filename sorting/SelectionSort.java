package com.sorting;

import java.util.Arrays;

public class SelectionSort {
	public static void sort(int[] arr)
	{
		int length=arr.length;
		//buisness logic
		for(int i=0;i<length-1;i++)
		{		
			for(int j=i+1;j<length;j++)
			{
				if(arr[i]<arr[j])
				{
					//swap
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr= {23,45,23,45,567,5,45,3,42,27,78};
		//SelectionSort s=new SelectionSort();
		System.out.println("original array : "+Arrays.toString(arr));
		sort(arr);
		System.out.println("sorted array : "+Arrays.toString(arr));		
		
	}
}
