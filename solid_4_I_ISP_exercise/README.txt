En este ejercicio nos interesa que los usuarios de la clase TextProcessor que 
no necesiten la funcionalidad de corregir textos no tengan ninguna dependencia con
el tipo Language

Para ello, debereis descomponer la funcionalidad de la clase ProcesadorTexto en dos interfaces, 
una basica (con los metodos add() y text() y otra mas "compleja" con funcionalidad para la correccion.

Una vez descompuesta, adaptad el test para ver que cada uno puede usar el tipo que debe 
(es decir, el simple_test no necesita el tipo de procesador con idioma)