public class StringMethods
{
	public static void main(String[] args) {
		String s1 = "Java World";
		String s2 = "Is Vast";
		System.out.println("S1 String is : " +s1);
		System.out.println("S2 String is : " + s2);
	    System.out.println("Comcating s1 & s2 : " + s1.concat(s2));
		System.out.println("Changing s1 to UpperCase : " + s1.toUpperCase());
		System.out.println("Lenght of s2 is : " + s2.length());
		System.out.println("index of L is : " + s1.indexOf('l'));
		System.out.println("Char @ 4 is: " + s1.charAt(4));
		
		String [] output =   s2.split(" ");
	    for(int i =0; i<output.length; i++){
		    System.out.println("Splitting S2 string :" + output[i]);
		}
		
		s1 = s1.concat ("is really big like a Ocean."); // concat() method
		System.out.println(s1);
		System.out.println(s2.replace('V','Y'));
		System.out.println(s2.compareTo(s1));
		
	
		
		
		
	}
}
