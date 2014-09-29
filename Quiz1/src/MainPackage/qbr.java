package MainPackage;

import java.util.Scanner;

public class qbr {
	private static Scanner in;

	public static void main(String[] args) {

		double att;
		double comp;
		double yds;
		double td;
		double inter;
		double a;
		double q;
		double c;
		double d;
		double passerrating;

		in = new Scanner(System.in);
		System.out.println("Pass attempts");
		att = in.nextDouble();

		System.out.println("Passes completed");
		comp = in.nextDouble();

		System.out.println("Total Yds");
		yds = in.nextDouble();

		System.out.println("Touchdowns");
		td = in.nextDouble();

		System.out.println("Interceptions");
		inter = in.nextDouble();

		a = (((comp / att) - .3) * 5);


		q = (((yds/att)-3)*.25);

		c = ((td / att) * 20);


		d = 2.375 - ((inter / att) * 25);

		passerrating = (((a + q + c + d) / 6)*100);
		System.out.println(passerrating);
	}
}
