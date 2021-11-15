package fifth_work;
import java.util.*;

public class calendar_95 {

	public static void main(String[] args) {
		GregorianCalendar now = new GregorianCalendar();
		System.out.println(now.get(GregorianCalendar.YEAR)+"年"
				+ (now.get(GregorianCalendar.MONTH)+1)+"月"
				+ now.get(GregorianCalendar.DATE)+"日");
		now.setTimeInMillis(1234567898765L);
		
		System.out.println(now.get(GregorianCalendar.YEAR)+"年"
				+ now.get(GregorianCalendar.MONTH)+"月"
				+ now.get(GregorianCalendar.DATE)+"日");
		
	}

}
