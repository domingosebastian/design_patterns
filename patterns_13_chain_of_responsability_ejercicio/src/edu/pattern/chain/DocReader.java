package edu.pattern.chain;

public class DocReader implements Reader {


	@Override
	public String content(Document document) {
		return "doc " + document.getContent();
	}

}
