package edu.pattern.chain;

public class OdtReader implements Reader {

	@Override
	public boolean accept(Document document) {
		return document.getType().equals("odt");
	}

	@Override
	public String content(Document document) {
		return "odt " + document.getContent();
	}

}
