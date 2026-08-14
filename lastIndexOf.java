import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String s = sc.nextLine();
	
	char ch = sc.next().charAt(0);
	
	int index = s.lastIndexOf(ch);
	System.out.println("Last Index: " +index);
	
	}
}