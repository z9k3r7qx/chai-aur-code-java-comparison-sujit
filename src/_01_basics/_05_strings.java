package _01_basics;

public class _05_strings {

	public static void main(String[] args) {
		
		
		String name = "Sujit";
		String getTrimString = " sujit ";
		String getSplitString  = "My/name/sujit";
		int age = 22;
//		%s and %d are format specifiers: placeholders that get replaced by real values when the string is built.
		System.out.println(String.format("My name is %s and my age is %d", name,age));
		
		System.out.println(name.charAt(1));
		System.out.println(name.length());
		System.out.println(name.indexOf('t'));
		System.out.println("Substring is :"+name.substring(1,name.length()-2));
		System.out.println("Triming string is :" + getTrimString.trim());
		System.out.println("Contains :"+getTrimString.contains("u"));
		System.out.println("Replacing string is :"+name.replace('j', 'm'));
//		System.out.println("Splited string is :" + getSplitString.split("-"));
		
		String arr[] = getSplitString.split("/");
		System.out.println(arr[0]);

 				
       String[] heros = {"shaktiman", "naagraj", "doga"};
        String name2 = "sujit";
        System.out.println(name2.toUpperCase());
        
	}

}
