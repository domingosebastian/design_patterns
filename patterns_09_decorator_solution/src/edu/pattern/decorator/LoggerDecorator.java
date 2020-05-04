package edu.pattern.decorator;

import java.util.List;

public class LoggerDecorator implements DataBase {

	private DataBase impl;
	private Logger logger;
	
	public LoggerDecorator(DataBase impl, Logger logger) {
		this.impl = impl;
		this.logger = logger;
	}
	
	@Override
	public void insert(String record) {
		logger.add("insert " + record);
		impl.insert(record);
	}

	@Override
	public List<String> records() {
		logger.add("read");
		return impl.records();
	}

	

}
