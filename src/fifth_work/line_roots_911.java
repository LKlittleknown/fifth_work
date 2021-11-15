package fifth_work;

import java.util.*;

public class line_roots_911 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input your a, b, c, d, e, f:");
		double a, b, c, d, e, f;
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		d = input.nextDouble();
		e = input.nextDouble();
		f = input.nextDouble();
		
		LinearEquation root = new LinearEquation(a,b,c,d,e,f);
		
		if(root.isSolvable()) {
			System.out.printf("x = %.3f, y = %.3f\n", root.getX(), root.getY());
		}else System.out.println("The equation has no solution.");
		
	}

}
