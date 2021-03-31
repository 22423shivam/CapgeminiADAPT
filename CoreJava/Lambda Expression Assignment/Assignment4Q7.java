package CapgeminiAssignment;
import java.util.HashMap;
import java.util.Map;

public class Assignment4Q7 {
 
	public static void main(String[] args) {
		
		Map<String, String> map=new HashMap();
		map.put("Zebra","Zoo");
		map.put("Lion","Jungle");
		map.put("Whale","Ocean");
		map.put("Dog", "Domestic pet");
		System.out.println(map);
		System.out.println("\n");
		map.entrySet().stream().forEach(entry->System.out.print(entry.getKey().concat(entry.getValue())));
	}
};
