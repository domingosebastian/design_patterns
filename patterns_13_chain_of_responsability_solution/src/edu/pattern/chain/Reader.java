package edu.pattern.chain;

public interface Reader {

	// The accept method allows the Reader itself to indicate whether
	// can process a document type or not, releasing this responsibility to the
	// DocumentProcessor
	boolean accept (Document document);
	
	String content (Document document);

}
