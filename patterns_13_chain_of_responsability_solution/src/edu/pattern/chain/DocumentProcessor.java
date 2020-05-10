package edu.pattern.chain;

import java.util.Arrays;
import java.util.List;

public class DocumentProcessor {

	private List<Reader> readers;

	public DocumentProcessor(Reader... readers) {
		this.readers = Arrays.asList(readers);
	}

	public String concat(List<Document> documents) {

		String result = "";

		for (Document doc : documents) {
			for (Reader lector : readers) {
				if (lector.accept(doc)) {
					result += lector.content(doc);
				}
			}

			result += "\n";
		}

		return result;
	}

}
