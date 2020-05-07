package edu.pattern.chain;

public class PdfReader implements Reader {


	@Override
	public String content(Document document) {
		return "pdf " + document.getContent();
	}

}
