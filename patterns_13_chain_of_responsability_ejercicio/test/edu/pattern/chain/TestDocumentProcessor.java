package edu.pattern.chain;


import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import edu.pattern.chain.Document;
import edu.pattern.chain.DocumentProcessor;

public class TestDocumentProcessor {

	@Test
	public void test() {
		List<Document> list = Arrays.asList(
				 new Document("doc", "document doc"),
				 new Document("pdf", "document pdf"),
				 new Document("odt", "document odt")
				 );
		
		String result = new DocumentProcessor().concat(list);
		
		String expected = "doc document doc\n" + 
				"pdf document pdf\n" + 
				"odt document odt\n";
		
		assertEquals(expected, result);
	}

}
