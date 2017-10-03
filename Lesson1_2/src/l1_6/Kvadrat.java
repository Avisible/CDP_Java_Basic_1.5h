package l1_6;

public class Kvadrat {
	public static void main(String[] args) {
		double Skv; // площадь внешнего квадрата
		double stononaKv;
		double radiusOkr;
		double skv2; // площадь внутреннего вкадрата
		double x; // во сколько раз пощадь вписанного квадрата меньше заданного

		Skv = 25;
		stononaKv = Math.sqrt(Skv); // вычисляем сторону квадрата
		radiusOkr = stononaKv / 2;
		skv2 = 0.5 * radiusOkr * radiusOkr * 4;
		x = Skv / skv2;

		System.out.println("x=" + x);
	}

}
