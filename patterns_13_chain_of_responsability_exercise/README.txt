Our application allows the management of documents represented by the Document class

In particular, we have different readers for the different document formats represented by
the Document Reader interface and its different implementations: PdfReader, OdtReader ... (it is expected that
the number of available readers is increasing).

A basic functionality offered by the DocumentProcessor, given a list of documents, is to return
a string with the content of all of the documents processed by its corresponding reader (depending on the document type).

The system is quite structured but there is still a part that we don't like: DocumentProcessor
it has to be modified for each type of reader that appears.

Modify the code for each reader to determine whether or not it can process a document and make it so that in the construction of DocumentProcessor all available readers are passed to it. The goal is that,
in the event that a new format appears, with its corresponding reader, you do not have to change anything
in DocumentProcessor.

Once this is done, adapt the TestDocumentProcessor to your changes and check that the test continues to work.
