package JavaPrograms.RegexRegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexwordcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mixwords="hello word hello frnd hello";
		Pattern p= Pattern.compile("word");
		Matcher m=p.matcher(mixwords);
		int count=0;
		while (m.find())
		{
			count++;
			
			System.out.print("Cont of hello matches in the mix words is " + count+ ": "  + " "+m.start() +" To "+ +m.end());
			System.out.print("\n");
		}
		
		
		
		
	}

}
	