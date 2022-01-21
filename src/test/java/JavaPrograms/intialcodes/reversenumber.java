package JavaPrograms.intialcodes;

import java.util.Scanner;

public class reversenumber {


	public void reversernum() {

		int number=141;
		int i = 0;
		int j=0;
        int opnumber=number;
		while (opnumber>0)
		{

			i=opnumber%10;
			opnumber = opnumber/10;		
			j=(j*10)+i;
	
		}
		System.out.println(j);
		System.out.println(i);
		System.out.println(number);
		 
		if (number==j) {
			System.out.println(" It is a pallindrome");
		}
		else {
			System.out.println(" It is a not pallindrome");
		}
	}

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reversenumber re=new reversenumber();
		re.reversernum();
		
	}

}
