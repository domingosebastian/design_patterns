package edu.pattern.decorator;

import java.util.ArrayList;
import java.util.List;

public class InMemoryDataBase implements DataBase {

	private final List<String> records = new ArrayList<>();
	
	@Override
	public void insert(String record) {
		records.add(record);
	}

	@Override
	public List<String> records() {
		return new ArrayList<>(records);
	}

}
