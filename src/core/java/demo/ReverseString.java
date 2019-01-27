package core.java.demo;

public class ReverseString {
	public void reverse() {
		String str ="Naman";
		String revstr= "";
		
		//String Various Methods
		for(int i=0;i<str.length();i++) {
			//System.out.println(str.charAt(i));
			//System.out.println(str.indexOf("h"));
			//System.out.println(str.substring(2));
			//System.out.println(str.equals("Rahul")); //returns true if correct
			//System.out.println(str.concat(" Roy"));
			
		}
		//Reverse String
		for(int j=str.length()-1;j>=0;j--) {
			revstr=revstr+str.charAt(j);
		}
		//System.out.println(revstr);
		
		//Palindrome string
		if(str.equalsIgnoreCase(revstr)) {
			System.out.println("Palindrome string");
		}
		else {
			System.out.println("String not matched");
		}
	}

	public static void main(String[] args) {
		ReverseString rs = new ReverseString();
		rs.reverse();

	}

}
