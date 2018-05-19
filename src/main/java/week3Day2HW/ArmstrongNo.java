package week3Day2HW;

public class ArmstrongNo {

	public static void main(String[] args) {

		int i ;

		int c=0;

		for(i=100;i<1000;i++)

		{
			int j=i;

			int temp =0;

			while(j>0)

			{
				c=j%10;

				j=j/10;

				temp = temp +(c*c*c);

			}

			if(temp==i)

				System.out.println("The number " + i + " is Armstrong number" );

		}

	}



}