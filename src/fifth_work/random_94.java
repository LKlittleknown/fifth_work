package fifth_work;

import java.util.*;

public class random_94 {

	public static void main(String[] args) {
		Random random=new Random(1000);
		
		for(int i=1; i<=50; i++) {
			if(i%10==0)
				System.out.println(random.nextInt(100));
			else 
				System.out.print(random.nextInt(100)+" ");
		}

	}

}
