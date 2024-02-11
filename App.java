package com.promeniotech;

public class App {

	public static void main(String[] args) {
		
		Logger logger = new AsteriskLogger();
		
		logger.log("Good bye");
		logger.error("Hello");
		
		Logger logger2 = new SpacedLogger();
		
		logger2.log("Good bye");
		
		
		logger2.error("Good bye");

	}

}
