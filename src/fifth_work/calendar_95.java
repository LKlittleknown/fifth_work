package fifth_work;
import java.util.*;

public class calendar_95 {

	public static void main(String[] args) {
		GregorianCalendar now = new GregorianCalendar();
		System.out.println(now.get(GregorianCalendar.YEAR)+"��"
				+ (now.get(GregorianCalendar.MONTH)+1)+"��"
				+ now.get(GregorianCalendar.DATE)+"��");
		now.setTimeInMillis(1234567898765L);
		
		System.out.println(now.get(GregorianCalendar.YEAR)+"��"
				+ now.get(GregorianCalendar.MONTH)+"��"
				+ now.get(GregorianCalendar.DATE)+"��");
		
	}

}
