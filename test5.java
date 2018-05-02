package a;

import java.util.Scanner;

public class shiyansi2{
	public static void main(String[] args) {
		

		Scanner scanTest = new Scanner(System.in);
		System.out.println("请输入三个数");
		int a = scanTest.nextInt();
		int b = scanTest.nextInt();
		int c = scanTest.nextInt();
		if (a + b > c) {
			System.out.println("是三角形");
		} else {
			System.out.println("不是三角形");
		}

	}
}