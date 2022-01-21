package JavaPrograms.RegexRegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifiers {
	static String splitNCS = "aaabbbaabababaaaaaba";
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quantifiers q= new Quantifiers();

		q.normalstarts();
		q.plus();
		q.asteric();
		q.number();
		q.questionmark();
		
			}
	
	public void normalstarts() {
		
		Pattern pa=Pattern.compile("a");
	    Matcher ma=pa.matcher(splitNCS);
	    System.out.println("normalstarts :\n");
		while (ma.find())
		{
			System.out.print(ma.group()+ ma.start()+" ");		
		}
		
	}
			
			public void plus() {
				
				Pattern pa=Pattern.compile("a+");
			    Matcher ma=pa.matcher(splitNCS);
			    System.out.println("Plus :\n");
				while (ma.find())
				{System.out.print(ma.group()+ ma.start()+" ");			
				}
				
			}
				public void asteric() {
					
					String asteric = "aaabbbaabababaaaaaba";
					
					Pattern pa=Pattern.compile("a*");
				    Matcher ma=pa.matcher(splitNCS);
				    System.out.println("asteric :\n");
					while (ma.find())
					{
						System.out.print(ma.group()+ ma.start()+" "+"\n");	
					}
				}
      public void number() {
					
					
					
					Pattern pa=Pattern.compile("a{2,3}");
				    Matcher ma=pa.matcher(splitNCS);
				    System.out.println("number :\n");
					while (ma.find())
					{
						System.out.print(ma.group()+ ma.start()+" ");		
					}
      }
      public void questionmark() {
			
			
			
			Pattern pa=Pattern.compile("a?");
		    Matcher ma=pa.matcher(splitNCS);
		    System.out.println("questionmark :\n");
			while (ma.find())
			{
				System.out.print(ma.group()+ ma.start()+" ");		
			}
			
			

		
	}
					

				
			}


