package app.sortingAlgo;

public class BubbleSort {
	
	public static void bubble(int[] numbers)
	{
		int arr=numbers.length;
		int count=0,cnt=0;
		for(int i=0;i<numbers.length;i++)
		{
			 count=0;
			for(int j=0;j<numbers.length-1-i;j++)
			{
				if(numbers[j]>numbers[j+1])
				{
					count++;
					cnt++;
					int temp=numbers[j];
					numbers[j]=numbers[j+1];
					numbers[j+1]=temp;
				}
				
			}
			if(count==0)
			{
				break;
			}
		}
		System.out.println("counts : "+cnt);
	}

	public static void main(String[] args) {
		
		int[] arr= {2,6,23,27,29,67,44,45,54};
		
		bubble(arr);
		System.out.println("array is sorted");
		for(int a:arr)
		{
			System.out.print(a+", ");
		}

	}

}
