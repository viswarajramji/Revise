package Collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {
	public static void main(String[] args) {
		Map<Integer, String> maps = new HashMap<>();
		maps.put(1, "abc");
		maps.put(2, "efg");
		maps.put(3, "hij");
		for (Integer key : maps.keySet()) {
			System.out.println(key + " " + maps.get(key));
		}

		for (Map.Entry<Integer, String> map : maps.entrySet()) {
			System.out.println(map.getKey());
			System.out.println(map.getValue());
		}
	}
}
