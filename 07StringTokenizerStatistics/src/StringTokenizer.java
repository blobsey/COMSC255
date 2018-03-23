//Assignment #: 7

//Student Name:  Blake Randall

 //Class:  COMSC-255

//Section: 8306


public class StringTokenizer {
	String in;
	int count;
	char delim;
	
	public StringTokenizer(String str, char delim) {
		in =  str;
		this.delim = delim;
		this.count = countTokens();
	}
	
	public int countTokens() {
		count = 1;
		int i = 0;
		char c = in.charAt(0);
		if(c == delim) //catch faulty user input such as "1,,2"
			for(; i < in.length() && in.charAt(i) == delim; i++);
				
		if(in.isEmpty()) //catch empty input
			return 0;
		
		char prev = in.charAt(i); //current, previous
		for(; i < in.length(); i++)
		{
			c = in.charAt(i);
			if(in.charAt(i) == delim && prev != delim) //catch bad input
				count++;
			prev = c;
		}
		return count;
	}
	
	public String nextToken() {
		
		if(in.isEmpty()) //catch empty input
			return "";
		
		int i;
		char c = in.charAt(0);
		
		if(c == delim) //catch faulty user input such as "1,,2"
		{
			int count;
			for(count = 0; count < in.length() && in.charAt(count) == delim; count++);
			in = in.substring(count, in.length());
		}
		
		String toStr = "";
		
		for(i = 0; i < in.length(); i++)
		{
			c = in.charAt(i);
			if(c == delim)
				break;
			toStr += c;
		}
		
		in = in.substring(i, in.length());
		
		System.out.println("STRING WHOLE: " + in);
		System.out.println(toStr);
		
		return toStr;
	}
}
