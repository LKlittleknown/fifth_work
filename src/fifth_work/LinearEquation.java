package fifth_work;

public class LinearEquation {
	
	private double a, b, c, d, e, f;
	
	public LinearEquation(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
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
	public double get_d() {
		return d;
	}
	public double get_e() {
		return e;
	}
	public double get_f() {
		return f;
	}
	
	public boolean isSolvable() {
		if(a*d - b*c != 0)return true;
		else return false;
	}
	
	public double getX() {
		double rootx = (e*d - b*f)/(a*d - b*c);
		return rootx;
	}
	
	public double getY() {
		double rooty = (a*f - e*c)/(a*d - b*c);
		return rooty;
	}
	
}
