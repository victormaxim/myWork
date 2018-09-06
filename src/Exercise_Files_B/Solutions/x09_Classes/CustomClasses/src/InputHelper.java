package Exercise_Files_B.Solutions.x09_Classes.CustomClasses.src;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class InputHelper {
	public static String getInput(String prompt) {
		BufferedReader stdin = new BufferedReader(
				new InputStreamReader(System.in));

		System.out.print(prompt);
		System.out.flush();
		
		try {
			return stdin.readLine();
		} catch (Exception e) {
			return "Error: " + e.getMessage();
		}
	}
}
