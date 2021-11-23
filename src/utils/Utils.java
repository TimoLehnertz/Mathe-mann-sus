package utils;

import java.util.Scanner;

public class Utils {

	public static boolean askBooleanValue(String question) {
		Scanner s = new Scanner(System.in);
		System.out.println("Wahr oder falsch? " + question);
		String line = s.next();
		while(!isStrWarheits(line)) {
			line = s.next();
		}
		return getWarheitsWert(line);
	}
	
	private static boolean isStrWarheits(String s) {
		return s.contentEquals("W") || s.contentEquals("w") || s.contentEquals("F") || s.contentEquals("f") || s.contentEquals("T") || s.contentEquals("t") || s.contentEquals("1") || s.contentEquals("0") || s.contentEquals("wahr") || s.contentEquals("Wahr") || s.contentEquals("falsch") || s.contentEquals("Falsch") || s.contentEquals("true") || s.contentEquals("True") || s.contentEquals("False") || s.contentEquals("false");
	}
	
	private static boolean getWarheitsWert(String s) {
		return s.contentEquals("W") || s.contentEquals("w") || s.contentEquals("T") || s.contentEquals("t") || s.contentEquals("1") || s.contentEquals("Wahr") || s.contentEquals("wahr") || s.contentEquals("true") || s.contentEquals("True");
	}
}