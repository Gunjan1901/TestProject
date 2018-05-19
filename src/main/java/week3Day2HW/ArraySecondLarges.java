package week3Day2HW;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraySecondLarges {

	public static void main(String[] args) {
		int size;
		System.out.println("Enter the size of array");
		Scanner  scanobj = new Scanner(System.in);
		size = scanobj.nextInt();
		int[] num = new int[size];

		//ArrayList<Integer> num = new ArrayList<Integer>();
		for(int j =0;j<size;j++)
		{
			num[j]= scanobj.nextInt();
			System.out.println(num[j]);
		}
		//num.add(scanobj.nextInt());
		int temp;

		//int[] num = {1,2,3,10,100,100,200};

		for(int i =0; i<size;i++)
		{
			for(int j =i+1;j<size;j++)
			{
				if(num[i]>num[j])
				{
					temp = num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}

		}
		System.out.println("The sorted numbers are : " );
		for(int k =0; k<size;k++)
		{
			System.out.println(num[k]);
		}
		System.out.println("The 2nd largest number in the array is : " + num[size-2]);






	}

}
