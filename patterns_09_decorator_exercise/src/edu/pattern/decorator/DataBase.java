package edu.pattern.decorator;

import java.util.List;

public interface DataBase {

	void insert (String record);
	
	List<String> records();
}
