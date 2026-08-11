import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		sc.nextLine();
		String s2 = sc.nextLine();
		System.out.println(+ s1.length());
		System.out.println(+ s2.length());
		
		for(int i=s1.length()-1;i>=0;i--){
		    System.out.println(s1.charAt(i));
		}
		for(int i=s2.length()-1;i>=0;i--){
		    System.out.println(s2.charAt(i));
		}
	}
}