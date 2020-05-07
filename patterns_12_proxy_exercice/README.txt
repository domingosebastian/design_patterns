Nuestro sistema bancario tiene una interface basica Account. 

Esta permite tener el nombre y la cantidad de dinero de un cliente, asi como efectuar un 
nuevo movimiento.

La implementacion basica es NormalAccount.

Ahora queremos crear un nuevo tipo de cuenta que NO permita quedar en negativo. NO hay que 
modificar NormalAccount. Hay que crear una nueva que ofrezca la misma API (interface Cuenta) y
delege las llamadas que recibe a  una NormalAccount excepto, y aqui esta el trabajo, en caso 
que el movimiento requerido fuese a dejar la cuenta en negativo. En este caso, simplemente no 
debe realizar la operacion (un caso mas realista probablemente lanzaria una excepcion, pero aqui
no lo haremos).

Es importante que la clase que creeis nueva use una NormalAccount para delegar las llamadas. Ahora 
la clase es muy sencilla, pero se supone que algunos metodos se pueden complicar en un futuro y
no queremos codigo duplicado.

Una vez tengais la clase, modificad el test test_new_account de TestAccounts para que en 
lugar de usar una clase NormalAccount use vuestra nueva clase.