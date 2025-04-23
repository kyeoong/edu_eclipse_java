package och11_ex02;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetEx02 {

	public static void main(String[] args) {
		
		int i = 0;
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(52);
		ts.add(24);
		ts.add(72);
		ts.add(34);
		ts.add(52);
		
		System.out.println(ts);
		
		for(Integer t : ts) {
			i++;
			System.out.println(i + "번 = " + t);
		}
		
		HashSet<Integer> aa = new HashSet<Integer>();
		aa.add(52);
		aa.add(24);
		aa.add(72);
		aa.add(34);
		aa.add(52);
		
		System.out.println(aa);
		
		int j = 0;
		for(Integer h : aa) {
			System.out.println(j + "번 = " + h);
			j++;
		}

	}

}
