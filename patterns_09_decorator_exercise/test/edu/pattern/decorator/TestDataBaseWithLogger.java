package edu.pattern.decorator;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import edu.pattern.decorator.DataBase;
import edu.pattern.decorator.InMemoryDataBase;
import edu.pattern.decorator.Logger;

public class TestDataBaseWithLogger {

	private Logger logger = new Logger();
	private DataBase withoutLogger = new InMemoryDataBase();
	
	private DataBase bbdd;
	
	@Before
	public void init() {
		
		// create a LoggerDecorator using variables withoutLogger and logger
		bbdd = null;
	}
	
	
	// you must not modify this test method 
	@Test
	public void test_logger_decorator() {
		
		assertNotNull("you must initialize bdd variable in the init() method",bbdd);
		assertTrue("logger is not empty",logger.getLogs().isEmpty());
		bbdd.insert("record");
		
		assertTrue("bbdd has not the new record", withoutLogger.records().contains("record"));
		assertTrue("logger has not registered the new record", logger.getLogs().contains("insert record"));

		// get records using the adapter with the logger
		List<String> records = bbdd.records();
		
		assertTrue("the adapter does not have the new record", records.contains("record"));
	
		assertTrue("read access has not been recorded", logger.getLogs().contains("read"));
	}

	
}
