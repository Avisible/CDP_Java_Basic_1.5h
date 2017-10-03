package l1_14;

import java.util.Scanner;

public class Formula {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = 0, Fx;

		System.out.print("������� x: ");
		if (sc.hasNextDouble())
			x = sc.nextDouble();

		if (x >= 3)
			Fx = -x * x + 3 * x + 9;
		else
			Fx = 1 / (Math.pow(x, 3) - 6);

		System.out.println("F(x)=" + Fx);
	}

}
