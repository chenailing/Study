package test2;

import java.util.Scanner;

public class chenailing1607416216 {
	public static void main(String[] args) {
		jiajianchengchu();
	}
	public static void jiajianchengchu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������һ������");
		int a = Integer.valueOf(scanner.nextLine());
		System.out.println("������һ�������");
		String str = scanner.nextLine();
		System.out.println("������ڶ�������");
		int b = Integer.valueOf(scanner.nextLine());
		System.out.println(a + str + b + "=" + getchenailing1607416216(a, b, str));
	}

	public static int getchenailing1607416216(int a, int b, String str) {

		if ("+".equals(str)) {
			return a + b;
		}
		if ("-".equals(str)) {
			return a - b;
		}
		if ("*".equals(str)) {
			return a * b;
		}
		if ("/".equals(str)) {
			return a / b;
		}
		return 0;

	}

}