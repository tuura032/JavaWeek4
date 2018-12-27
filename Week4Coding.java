import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week4Coding {

	public static void main(String[] args) {
		
		// Create and populate list of names
		List<String> employeeNames = new ArrayList<String>();
		employeeNames.add("John");
		employeeNames.add("Paul");
		employeeNames.add("Quinn");
		employeeNames.add("Chauncey");
		employeeNames.add("Michael");
		
		// Create and populate set of unique ids
		Set<Integer> ids = new HashSet<Integer>();
		ids.add(101);
		ids.add(102);
		ids.add(103);
		ids.add(104);
		ids.add(105);
		
		// Use a map to associate each employee with their unique id
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		
		int i = 0; // index of each name
		for (int id : ids) {
			employeeMap.put(id, employeeNames.get(i));
			i++;
		}
		
		// access the keys with keySet, then print each mapped key value pair
		Set<Integer> employeeKeys = employeeMap.keySet(); // create set of all keys
		for (Integer key : employeeKeys) {
			System.out.println(key + " : " + employeeMap.get(key)); // print key + value pair
		}
		
		// create string builder called idsBuilder
		StringBuilder idsBuilder = new StringBuilder();
		for (int id : ids) {
			idsBuilder.append(id);
			idsBuilder.append("-");
		}
		System.out.println(idsBuilder.toString());
		
		
		// create string builder called namesBuilder
		StringBuilder namesBuilder = new StringBuilder();
		for (String name : employeeNames) {
			namesBuilder.append(name);
			namesBuilder.append(" ");
		}
		System.out.println(namesBuilder.toString());
		

	}

}
