package com.promeniotech;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < log.length(); i++) {
			result.append(log.charAt(i) + " ");
		
		} 
		
		System.out.println(result.toString());
		
	}

	@Override
	public void error(String error) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < error.length(); i++) {
			result.append(error.charAt(i) + " ");
		
		} 
		
		System.out.println("ERROR: " + result.toString());
		
	}

}
