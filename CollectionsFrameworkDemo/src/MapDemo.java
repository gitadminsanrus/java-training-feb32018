import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		
		Map map = new TreeMap();
		
		map.put("KEY1", 1);
		map.put("KEY3", 3);
		map.put("KEY2", 2);
		map.put("KEY5", 5);
		
		System.out.println(map.get("KEY1"));
		map.put("KEY1", 10);
		System.out.println(map.get("KEY1"));
		
		Iterator it = map.keySet().iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
