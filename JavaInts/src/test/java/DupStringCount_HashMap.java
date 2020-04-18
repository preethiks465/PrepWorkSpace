import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DupStringCount_HashMap {

	public static void main(String[] args) {
		String s= "I am am good girl good ";
		int count=1;
		char[]c = s.toCharArray();
		Map<Character,Integer>hmap = new HashMap<Character,Integer>();
		for(int i=0;i<c.length;i++) {
			if(hmap.get(c[i])==null) {
				hmap.put(c[i], count);
			}
			else
			{
				hmap.put(c[i], hmap.get(c[i])+1);
			}
		}
		System.out.println(hmap.entrySet());
	}

}
