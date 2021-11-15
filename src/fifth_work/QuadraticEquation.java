package fifth_work;

import java.util.*;

public class QuadraticEquation {
	private double a, b, c;
	
	public QuadraticEquation(double a, double b, double c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public double get_a() {
		return a;
	}
	
	public double get_b() {
		return b;
	}
	
	public double get_c() {
		return c;
	}
	
	public double getDiscriminant() {
		return b*b - 4*a*c;
	}
	
	public double getRoot1() {
		if(b*b-4*a*c<0)return 0;
		double t = -b + Math.sqrt(b*b-4*a*c);
		t = t/(2*a);
		return t;
	}
	
	public double getRoot2() {
		if(b*b-4*a*c<0)return 0;
		double t = -b - Math.sqrt(b*b-4*a*c);
		t = t/(2*a);
		return t;
	}
	
	
	
}
