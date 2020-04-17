package edu.solid.srp;

import java.util.List;
import java.util.stream.Collectors;

public class CSVExporter {

	public String export (List<Movie> movies) {
		
		return movies.stream()
		      .map(p -> (p.getTitle() + "," + p.getDirector() + "," + p.getGenre()))
		      .collect(Collectors.joining("\n"));
	}
}
