package edu.pattern.chain;

public class DocReader implements Reader {

	@Override
	public boolean accept(Document document) {
		return document.getType().equals("doc");
	}

	
	@Override
	public String content(Document document) {
		return "doc " + document.getContent();
	}

}
