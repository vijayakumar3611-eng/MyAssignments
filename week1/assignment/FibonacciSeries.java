package week1.assignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n=8;
		int firstterm=0;
		int secondterm=1;
		System.out.println("FibonacciSeries upto :"+n+" term");
		
		for (int i=0; i<=n; i++)
		{
			int nextterm=firstterm+secondterm;
			System.out.print(firstterm +",");
			firstterm=secondterm;
			secondterm=nextterm;
		}
		

	}

}
