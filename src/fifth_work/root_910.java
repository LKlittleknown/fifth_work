package fifth_work;

import java.util.*;

public class root_910 {

	public static void main(String[] args) {
		double a, b, c;
		Scanner input = new Scanner(System.in);
		System.out.print("ÊäÈëÄãµÄa,b,c:");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		QuadraticEquation x = new QuadraticEquation(a, b, c);
		if(x.getDiscriminant()>0) {
			System.out.printf("root1 = %.3f,root2 = %.3f\n", x.getRoot1(), x.getRoot2());
		}else if(x.getDiscriminant() == 0) {
			System.out.printf("root = %.3f\n", x.getRoot1());
		}else {
			System.out.println("The equation has no roots.");
		}

	}

}
