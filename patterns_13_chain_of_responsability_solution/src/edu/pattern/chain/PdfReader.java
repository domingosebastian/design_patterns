package edu.pattern.chain;

public class PdfReader implements Reader {

	@Override
	public boolean accept(Document document) {
		return document.getType().equals("pdf");
	}

	@Override
	public String content(Document document) {
		return "pdf " + document.getContent();
	}

}
