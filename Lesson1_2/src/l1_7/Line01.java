package l1_7;

import java.util.Scanner;

public class Line01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		int digit = 0;

		System.out.print("������� �����: ");
		if (sc.hasNextInt())
			number = sc.nextInt();

		while (number != 0) {
			digit = number % 10;
			number = number / 10;
			if (digit % 2 == 0) {
				System.out.println("� ����� ���� ������ �����.");
				return;
			}
		}
		System.out.println("� ����� ��� ������ ����.");
	}

}
