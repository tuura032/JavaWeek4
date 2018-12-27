import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class differentCollections {

	public static void main(String[] args) {
		/*
		 * List
		 * 
		 * Allows duplicates
		 * Elements ordered by index
		 * allows null values
		 * common implementation: ArrayList, LinkedList, Vector
		 */
		
		List<String> students = new ArrayList<String>();
		students.add("Paul");
		students.add("Paul");
		students.add("James");
		students.add(null); // can add null values
		
		// Print entire list
		for (String student : students) {
			System.out.println(student);
		}
		
		// Print index of list
		System.out.println(students.get(1));
		

		/*
		 * Set
		 * 
		 * No duplicates
		 * unordered
		 * allows null value
		 * Common Implementations: HashSet, LinkedHashSet, TreeSet
		 */
		
		Set<String> states = new HashSet<String>();
		states.add("Minnesota");
		states.add("Arizona");
		states.add("Illinois");
		states.add("California");
		
		System.out.println("States in list: " + states.size());
		System.out.println(states.contains("Deleware"));
		if (states.contains("Alabama")) {
			states.remove("Alabama");
		}
		
		for (String state : states) {
			System.out.println(state);
		}
		
		
		/*
		 * Map
		 * 
		 * Key value pairs (dictionary)
		 * values can be duplicate, but not keys
		 * common implementations: HashMap, LinkedHashMap, TreeMap, Hashtable
		 * 
		 */
		
		Map<Integer, String> racerPlacements = new HashMap<Integer, String>();
		racerPlacements.put(1,  "Paul");
		racerPlacements.put(2, "James");
		racerPlacements.put(3, "Rachel");
		
		// get key returns value
		System.out.println(racerPlacements.get(1));
		
		// access the keys with keySet
		Set<Integer> racerKeys = racerPlacements.keySet(); // create set of all keys
		for (Integer key : racerKeys) {
			System.out.println(key + " : " + racerPlacements.get(key)); // print key + value pair
		}
		
		// access all of the values with values method
		Collection<String> racers = racerPlacements.values(); // 
		for (String racer : racers) {
			System.out.println(racer);
		}
		
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("word1", "definition of word1");
		dictionary.put("word2", "definition of word 2");
		dictionary.put("word3", "definition of word 3");
		
		System.out.println(dictionary.get("word1"));
	}

}
