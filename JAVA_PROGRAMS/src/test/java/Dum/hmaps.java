package Dum;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class hmaps {

	public static void main(String[] args) {
		Map<String,Integer> hmap = new HashMap<String,Integer>();
		hmap.put("Preethi", 65);
		hmap.put("Krishna", 6);
		hmap.put("Divya", 54);
		
		Set<Entry<String,Integer>> ent = hmap.entrySet();
		for(Entry<String,Integer> e: ent) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
		System.out.println("**************************");
		
		for(Map.Entry<String,Integer> ent2: hmap.entrySet()) {
			System.out.println(ent2.getKey()+" "+ ent2.getValue());
		}
		
		System.out.println("**************************");
		
		for(String s: hmap.keySet()) {
			System.out.println(s+" "+hmap.get(s));
		}
		System.out.println("*************************");
		for(Integer i : hmap.values()) {
			System.out.println(i);
		}
		
		//hmap.forEach((k,v) -> System.out.println("key" + k +" value"+v));
		hmap.forEach((k,v) -> System.out.println(k+" "+v));

	}

}
