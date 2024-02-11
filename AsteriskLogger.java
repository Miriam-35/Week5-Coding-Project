package com.promeniotech;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
		
	}

	@Override
	public void error(String error) {
		String asterisk = "*************";
		String result = "";
		for (int i = 0; i < error.length(); i++) {
			result += asterisk.charAt(i);
		}
		System.out.println(asterisk + result +
		"\n***" + "Error: " + error + "***" + 
		"\n" + asterisk + result );
		
	}


}
