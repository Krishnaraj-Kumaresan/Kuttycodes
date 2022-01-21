package JavaPrograms.intialcodes;

public class sum100 {

	
	public void sum()
	{
		int i=0;
		int sum=0;
		
		for (i=0;i<=100;i++)
		{
			while(i%2==1)
			
			{
				sum=sum+i;
				i++;
			}
			
		}
		System.out.println(sum);
	}
	
	
	public void even()
	{
		int even=0;
		for (int j=0;j<=100;j++)
		{
			while(j%2==0)
			{
				even=even+j;
				j++;
			}
			
		}
		System.out.println(even);
	}
	public void countofOdd() {
		int a=1;
		int count =0;
		for (a=0;a<=100;a++)
		{
			if(a%2==1)
			{							
				count++;				
			}		
		}
		System.out.println(count);
	}	
	public void countofeven() {
		int a=1;
		int counteven =0;
		for (a=1;a<=100;a++)
		{
			if(a%2==0)
			{							
				counteven++;				
			}		
		}
		System.out.println(counteven);
	}	
	
	public static void main(String[] args) {
		System.out.println("Printing the sum of 1 to 100");
		sum100 s=new sum100();
		s.sum();
		System.out.println("Printing the Even of 1 to 100");
		s.even();
		System.out.println("Printing the countofOdd of 1 to 100");
		s.countofOdd();
		System.out.println("Printing the countofOdd of 1 to 100");
		s.countofeven();
	}
}
