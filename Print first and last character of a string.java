import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();//without space
		sc.nextLine();
		String s2 = sc.nextLine();//with space
		System.out.println(+ s1.length());
		System.out.println(+ s2.length());
		
		for(int i=0; i < s1.length(); i++ ){
		    System.out.println(s1.charAt(0));
		    System.out.println(s2.charAt(s2.length()-1));
		}
		for(int i=0; i < s2.length(); i++){
		    System.out.println(s2.charAt(0));
		    System.out.println(s2.charAt(s2.length()-1));
		}
	}
}