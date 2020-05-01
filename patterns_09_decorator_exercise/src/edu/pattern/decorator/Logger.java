package edu.pattern.decorator;

import java.util.ArrayList;
import java.util.List;

public class Logger {

    private List<String> log = new ArrayList<>();
    
    
    public void add(String message) {
    	   log.add(message);
    }

    public List<String> getLogs() {
    	    return log;
    }
}
