package l1_12;

import java.util.Scanner;

public class Hole {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = 0, b = 0, x = 0, y = 0, z = 0;

		System.out.print("Введите a: ");
		if (sc.hasNextDouble())
			a = sc.nextDouble();
		System.out.print("Введите b: ");
		if (sc.hasNextDouble())
			b = sc.nextDouble();
		System.out.print("Введите x: ");
		if (sc.hasNextDouble())
			x = sc.nextDouble();
		System.out.print("Введите y: ");
		if (sc.hasNextDouble())
			y = sc.nextDouble();
		System.out.print("Введите z: ");
		if (sc.hasNextDouble())
			z = sc.nextDouble();

		if ((a > x) && (b > y))
			System.out.println("Проидет.");
		else if ((a > y) && (b > x))
			System.out.println("Проидет.");
		else if ((a > x) && (b > z))
			System.out.println("Проидет.");
		else if ((a > z) && (b > x))
			System.out.println("Проидет.");
		else if ((a > y) && (b > z))
			System.out.println("Проидет.");
		else if ((a > z) && (b > y))
			System.out.println("Проидет.");
		else
			System.out.println("Не проидет.");
	}

}
