package JavaPrograms.intialcodes;

public class swapnumbers {

	public void SwapwithoutThird()
	{
		
		int a=5;
		int b=10;
		
		a  =  a  +  b;
		b  =  a  -  b;
		a  =  a  -  b;

		System.out.println("Print A is "+ a+ "Print B is "+ b);
				
		
	}
	public void SwapwithThird()
	{
		
		int a=5;
		int b=10;
		int c;
		
		c  =  a;
		a  =  b; 
		b  = c;

		System.out.println("Print A is "+ a+ "Print B is "+ b);
				
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swapnumbers sw =new swapnumbers();
		sw.SwapwithThird();
		sw.SwapwithoutThird();
	}

}
