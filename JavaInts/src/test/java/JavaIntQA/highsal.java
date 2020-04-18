package JavaIntQA;

import java.util.Map;
import java.util.TreeMap;

public class highsal {

	public static void main(String[] args) {
		String s = "I am feeling lucky";
		char[] c = s.toCharArray();
		Map<Character, Integer> emp = new TreeMap<Character, Integer>();
		for (char cs : c) {
			if(cs!=' ') {
			if (emp.get(cs) == null) {
				emp.put(cs, 1);
			} else
				emp.put(cs, emp.get(cs) + 1);
		}}
		System.out.println(emp);
		Map.Entry<Character,Integer> maxEntry = null;
		
		for(Map.Entry<Character, Integer> ent : emp.entrySet()) {
			if(maxEntry==null || maxEntry.getValue().compareTo(ent.getValue())<1) {
				maxEntry = ent;
			}
		}
		
		System.out.println(emp.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey());
		
		//System.out.println(maxEntry.getKey());
	}

}
