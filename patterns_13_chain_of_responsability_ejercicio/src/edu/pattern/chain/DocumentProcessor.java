package edu.pattern.chain;

import java.util.List;

public class DocumentProcessor {

	private Reader pdfReader;
	private Reader odtReader;
	private Reader docReader;
	
    public DocumentProcessor() {
    	   this.pdfReader = new PdfReader();
    	   this.odtReader = new OdtReader();
    	   this.docReader = new DocReader();
	}

	public String concat (List<Document> documents)  {
    	
    	    String result = "";
    	
    	    for (Document doc: documents) {
    	    	    if (doc.getType().equals("pdf")) {
    	    	    	   result += pdfReader.content(doc);
    	    	    } else if (doc.getType().equals("odt")) {
    	    	    		result += odtReader.content(doc);
    	    	    } else if (doc.getType().equals("doc")) {
    	    	    	result += docReader.content(doc);
    	    	    	} else {
    	    	    	   result += "unknown";
    	    	    }
    	    	    
    	    	    result += "\n";
    	    }
    	    
    	    return result;
    }

}
