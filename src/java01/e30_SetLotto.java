package java01;

import java.util.HashSet;
import java.util.Set;

public class e30_SetLotto {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		while(true) {
			int n = (int)(Math.random()*45 +1);
			set.add(n);
			if(set.size() ==6) break;
		}

		System.out.println(set);
	}

}
