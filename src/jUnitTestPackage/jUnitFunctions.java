package jUnitTestPackage;
import java.util.Scanner;

public class jUnitFunctions {
	public static void main(String[] args) {
		int num1;
		int num2;
		int sum;
		String s1;
		String s2;
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		s1 = sc.next();
		s2 = sc.next();
		sum = sum(num1,num2);
		System.out.println(sum);
		System.out.println(addstring(s1,s2));
		
	}
	public static int sum(int a ,int b) {
		int sum = a+b;
		return sum;
		}
	public static String addstring(String s1,String s2) {
		String c = s1.concat(s2);
		return c;
	}
}
