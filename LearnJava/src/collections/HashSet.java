package collections;

public class HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashSet uniqueNames = new HashSet();

	        uniqueNames.add("Alice");
	        uniqueNames.add("Bob");
	        uniqueNames.add("Charlie");
	        uniqueNames.add("Alice"); // Won't be added again due to uniqueness

	        System.out.println(uniqueNames.contains("Charlie")); // true
	        System.out.println(uniqueNames.contains("Eve")); // false

	        uniqueNames.remove("Bob");

	        System.out.println(uniqueNames); // Order might vary
	    }
	
	}

}
