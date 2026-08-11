import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        
        sc.nextLine();
        
        String s2 = sc.nextLine();

        System.out.println(+ s1.length());// find string length
        System.out.println(+ s2.length());//find string length

        for (int i = 0; i < s1.length(); i++) {
            System.out.print(s1.charAt(i) + " ");
        }// for traverse without space

        for (int i = 0; i < s2.length(); i++) {
            System.out.print(s2.charAt(i) + " ");
        }//for traverse with space
	}
}