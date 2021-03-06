package com.nav.inject;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

/*
 * Dummy implementation of logger.
 */

public class Logger {

	private ConsoleWriter consoleWriter;
	private LogWriter fileWriter;

	@Inject // JSR 330
	@Named(value="consoleWriter")
	public void setConsoleWriter(ConsoleWriter writer) {
		this.consoleWriter = writer;
	}

	@Inject
	@Named(value="squirrel")
	public void setFileWriter(LogWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

	public void writeFile(String text) {
		fileWriter.write(text);
	}

	public void writeConsole(String text) {
		if (consoleWriter != null)
			consoleWriter.write(text);
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy");
	}
	
}
