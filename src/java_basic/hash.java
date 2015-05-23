package java_basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Iterator;

public class hash {
	public static HashSet<Integer> potential_artset = new HashSet<Integer>();
	/* hash <id, user_list> */
	public static void hash_arraylist() {
		HashMap<Integer, ArrayList<Integer>> hashmap = new HashMap<Integer, ArrayList<Integer>>();
		hashmap.put(1, new ArrayList<Integer>());
		hashmap.get(1).add(10);
		hashmap.get(1).add(20);
		hashmap.put(2, new ArrayList<Integer>());
		hashmap.get(2).add(30);
		// traverse
		Iterator<Integer> it = hashmap.keySet().iterator();
		while (it.hasNext()) {
			Integer key = (Integer) it.next();
			System.out.print(key + ": ");
			for (int i = 0; i < hashmap.get(key).size(); i++) {
				System.out.print(hashmap.get(key).get(i) + ", ");
			}
			System.out.println("");
		}
	}

	public static void hashmap_basic() {
		HashMap<String, String> hashmap = new HashMap<String, String>();
		hashmap.put("cn", "中国");
		hashmap.put("jp", "日本");
		hashmap.put("fr", "法国");

		System.out.println(hashmap);
		System.out.println("cn:" + hashmap.get("cn"));
		System.out.println(hashmap.containsKey("cn"));
		System.out.println(hashmap.keySet());
		System.out.println(hashmap.isEmpty());

		hashmap.remove("cn");
		System.out.println(hashmap.containsKey("cn"));

		// traverse HashMap
		System.out.println("traversing...");
		/*
		 * Set<Entry<String, String>> sets = hashmap.entrySet();
		 * for(Entry<String, String> entry : sets) {
		 * System.out.print(entry.getKey() + ", ");
		 * System.out.println(entry.getValue()); }
		 */
		Iterator<String> it = hashmap.keySet().iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println("key:" + key);
			System.out.println("value:" + hashmap.get(key));
		}

	}
	
	public static void hash_transmit() {
		HashSet<Integer> set_a = new HashSet<Integer>();
		set_a.add(1);
		set_a.add(2);
		potential_artset = set_a;
		show_set(potential_artset);
		
		HashSet<Integer> set_b = new HashSet<Integer>();
		set_b.add(10);
		set_b.add(20);
		set_b.add(30);
		potential_artset = set_b;
		show_set(potential_artset);
	}

	public static void main(String[] args) {
		// hashmap_basic();
		//hash_arraylist();
		sort_hashmap();

	}
	//====== sort hashmap ========
	public static class ValueComparator implements Comparator<Map.Entry<String,Integer>> {  
        public int compare(Map.Entry<String,Integer> m,Map.Entry<String,Integer> n) {  
            return n.getValue() - m.getValue();  
        }  
    }  
	public static void sort_hashmap() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("d", 2);
		map.put("c", 1);
		map.put("a", 3);
		map.put("a", map.get("a").intValue() + 10);
        List<Map.Entry<String,Integer>> list=new ArrayList<Entry<String, Integer>>();  
        list.addAll(map.entrySet());  
        ValueComparator vc=new ValueComparator();  
        Collections.sort(list, vc);
        for(Iterator<Map.Entry<String,Integer>> it = list.iterator();it.hasNext();)  {  
            System.out.println(it.next());  
        }  
	}
	//==== end sort hashmap ======
	public static void show_set(HashSet<Integer> set) {
		Iterator<Integer> ir=set.iterator(); 
		while(ir.hasNext()) { 
			System.out.print(ir.next() + " ");
		}
		System.out.println("");
	}

}
