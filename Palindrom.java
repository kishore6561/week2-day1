package week2.day1;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Malayalam";
		String rev="";
		int l=str.length();
		for(int i=l-1;i>=0;i--) 
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		
		if(str.equalsIgnoreCase(rev)) 
		{
			System.out.println("Palindrome");
		}
		else 
			{
				System.out.println("Not a palindrome");
			}
			
	}

}
