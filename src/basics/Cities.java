package basics;

public class Cities {

	public static void main(String[] args) {
		// Declare and define an array
		String[] cities = {"London", "Manchester", "Dublin", "Edinburgh"};
		System.out.println(cities [0]);
		System.out.println(cities [1]);
		System.out.println(cities [2]);
		System.out.println(cities [3]);

		// Declare the aray
		String[] countries;
		
		// Define the array
		countries = new String[3];
		countries[0] = "Indonesia";
		countries[1] = "Australia";
		countries[2] = "UK";
		System.out.println(countries[1]);
		
		System.out.println("*************");
		
		// Define and declare the array (only size)
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "Manhattan";
		states[3] = "Ireland";
		states[4] = "Utah";
		int i = 0;
		
		// Do Loop: enters the loop THEN tests condition
		do {
			System.out.println("STATE: " + states[i]);
			i = i + 1;
		} while (i < 5);
		
		// While test condition first then enters loop
		int n = 0;
		boolean stateFound = false;
		while (!stateFound) {
			String state = states[n];
			System.out.println(state);
			if (state == "Ohio") {
			System.out.println("STATE FOUND!");
				stateFound = true;
			}
			n++;
		}
		
		System.out.println("\nPRINITNG WITH FOR LOOP");
		// For Loop: best structure for iterating through an array
		for (int x =0; x < 5; x++) {
			System.out.println(states[x]);
			
		}
		
		
	}

}
