Nuestra aplicacion permite la gestion de documentos representados por la clase Document

En particular, tenemos distintos lectores para los distintos formatos de documento representados por
la interface LectorDocumentos y sus distintas implementaciones: PdfReader, OdtReader ... (se espera que
se vaya incrementando el numero de lectores disponibles).

Una funcionalidad básica es DocumentProcessor, que permite, dada una lista de documentos, devolver 
una cadena con el contenido de todos ellos procesado por su lector correspondiente (en funcion del tipo 
de documento).

El sistema esta bastante estructurado pero aun hay una parte que no nos gusta: DocumentProcessor 
se tiene que modificar para cada tipo de lector que aparece. 

Modificad el codigo para cada lector sea el que determina si puede o no procesar un documento y haced que 
en la construccion de DocumentProcessor se le pasen todos los lectores disponibles. El objetivo es que,
en caso de que aparezca un nuevo formato, con su lector correspondiente, no se tenga que cambiar nada de 
DocumentProcessor.

Hecho esto, adaptad el TestDocumentProcessor a vuestros cambios y comprobad que el test sigue funcionando.