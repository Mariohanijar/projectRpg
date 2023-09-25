package entities;

import java.util.concurrent.TimeUnit;

public class Formatting {
	public static void slowPrint10(String output) {
		for (int i = 0; i < output.length(); i++) {
			char c = output.charAt(i);
			System.out.print(c);
			try {
				TimeUnit.MILLISECONDS.sleep(10);
			} catch (Exception e) {
			}
		}
	}

	public static void slowPrint50(String output) {

		for (int i = 0; i < output.length(); i++) {
			char c = output.charAt(i);
			System.out.print(c);
			try {
				TimeUnit.MILLISECONDS.sleep(50);
			} catch (Exception e) {
			}
		}
	}

	public static void slowPrint100(String output) {

		for (int i = 0; i < output.length(); i++) {
			char c = output.charAt(i);
			System.out.print(c);
			try {
				TimeUnit.MILLISECONDS.sleep(100);
			} catch (Exception e) {
			}
		}
	}
	public static void lineBreaker() {
		try { Thread.sleep (1500); } catch (InterruptedException ex) {}
	}
}
