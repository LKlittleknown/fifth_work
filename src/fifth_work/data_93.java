package fifth_work;

public class data_93 {

	public static void main(String[] args) {
		java.util.Date date=new java.util.Date();
		
		date.setTime(10000);
		System.out.println(date.toString());
		
		date.setTime(100000);
		System.out.println(date.toString());
		
		date.setTime(1000000);
		System.out.println(date.toString());
		
		date.setTime(10000000);
		System.out.println(date.toString());
		
		date.setTime(100000000);
		System.out.println(date.toString());
		
		date.setTime(1000000000);
		System.out.println(date.toString());
		
		date.setTime(10000000000L);
		System.out.println(date.toString());
		
		//ע�⣺������Ҫ�ں�����ϡ�L������Ȼ���ܱ�ʶ��
		date.setTime(100000000000L);
		System.out.println(date.toString());

	}

}
