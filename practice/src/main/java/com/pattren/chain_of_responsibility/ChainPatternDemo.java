package com.pattren.chain_of_responsibility;

/**
 * 责任链模式（Chain of Responsibility Pattern）为请求创建了一个接收者对象的链。<br>
 * 这种模式给予请求的类型，对请求的发送者和接收者进行解耦。
 * */
public class ChainPatternDemo {

	private static AbstractLogger getChainOfLoggers() {

		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);

		return errorLogger;
	}

	public static void main(String[] args) {
		AbstractLogger loggerChain = getChainOfLoggers();

		loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");

		loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");

		loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
	}
}