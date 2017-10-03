package l1_2;

import java.util.Scanner;

public class SumAndMul {
	public static void main(String[] args) {
		int x;
		int y;
		int sum, mul;
		
		Scanner conin = new Scanner(System.in);
		
		System.out.println("¬ведите x: ");
		while(!conin.hasNextInt())		{
			conin.next();
		}
		x = conin.nextInt();
		
		System.out.println("¬ведите y: ");
		while(!conin.hasNextInt())		{
			conin.next();
		}
		y = conin.nextInt();
		
		sum = x + y;
		mul = x * y;
		System.out.println("sum = " + sum + "; mul = " + mul);
	}
}

