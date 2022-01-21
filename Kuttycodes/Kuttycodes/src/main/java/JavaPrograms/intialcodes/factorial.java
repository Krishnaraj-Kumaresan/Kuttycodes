package JavaPrograms.intialcodes;

public class factorial {

	public void facto() {
     	int i,
		fact=1;  
		int number=5;//It is the number to calculate factorial    
		for(i=1;i<=number;i++){    
			fact=fact*i;  
		}    
		System.out.println(fact);
	}
	public void factorials() {
		int j,
		fact=1;  
		int number=8;//It is the number to calculate factorial    
		for(j=number;j>=1;j--){    
			fact=fact*j;  
		}    
		System.out.println(fact);   
	}  
	
	public void fibonacci() {
		//a+b, b+c, c+d
		int a=0;
		int b=1;
		int c=a+b;
	int finbanoci=10;
	
	for (int i=0;i<10;i++)
	{
		
		c=a+b;	
		System.out.print(c+" ");
		a=b;
		b=c;		
		
	}
	}
	
	public void evenOrOdd() {
		int number =7;
		if (number%2==1) {
			System.out.println("\nThe Given Number " + number +" ODD");
		}
		else if(number%2==0)
		{
			System.out.println("\nThe Given Number " + number +" Even");
			
		}
	}
	
	public static void main(String args[]){  
		factorial fs=new factorial();
		fs.facto();
		fs.factorials();
		fs.fibonacci();
		fs.evenOrOdd();
	}


}