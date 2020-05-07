package edu.pattern.chain;

public class OdtReader implements Reader {


	@Override
	public String content(Document document) {
		return "odt " + document.getContent();
	}

}
