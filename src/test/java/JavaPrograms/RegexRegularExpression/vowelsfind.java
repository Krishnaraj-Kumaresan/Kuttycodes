package JavaPrograms.RegexRegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class vowelsfind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*String takevowels= "krishNAraj";
Pattern p=Pattern.compile("[aeiou|AEIOU]");
Matcher m=p.matcher(takevowels);
System.out.println("Find below with Index of find vowels ");
while (m.find())
{
	
	
	
	System.out.println(m.group()+ " The find vowel in"
			+ " given string starts at the index: "+m.start());
}*/
vowelsfind spNS= new vowelsfind();


spNS.splitnumbercharsymbol();
	}
	
	public void splitnumbercharsymbol() {
		
		String splitNCS = "He9653r#$%^^e us&^$%&^$%&ing the"
				+ " Re6565653653623gex Grou&(^ping functions";
		
		Pattern pa=Pattern.compile("[a-zA-Z|\\s]");
	    Matcher ma=pa.matcher(splitNCS);
	    System.out.println("Spliting number and words from the given String :\n");
		while (ma.find())
		{
			System.out.print(ma.group());		
		}
		
		


		
	}

}
