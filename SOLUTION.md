##PARTE 1:

	Tests:
	![Screen Shot 2021-04-16 at 6 28 04 PM](https://user-images.githubusercontent.com/78422799/115094403-fe3adc80-9ee2-11eb-80e7-a54126188604.png)
	
	
	

##PARTE 4 (?) CONCEPTOS:

	1. ¿Cuáles son las acciones los tres momentos importantes de las excepciones? ¿Cuál es el objetivo de cada una? ¿Cómo se implementa en Java cada acción?.

    	Los tres momentos son: 
		1. Try: El codigo ejecuta una acción que puede devoler una excepcion.
                   2. Catch: Si el codigo devolvió una excepción se atrapa y se intenta manejar.
                   3. Finally: Ejecuta una línea de código después de que se haya controlado la excepcion (No necesariamente tiene que haber sido lanzada una 				excepcion, es decir siempre se ejecuta)
	
	2. ¿Qué es sobre-escritura de métodos? ¿Por qué aplicarla? ¿Cómo impedir que se sobre-escriba un método?.

    		La sobrescritura de métodos es cuando se quiere cambiar el comportamiento original de un método el cuál es heredado de otra clase. Sirve aplicarla, porque a veces unos métodos son declarados con un comportamiento que no aplica en el contexto en el que se encuentra. Para eso existen las clases abstractas que basicamente lo que hacen es definir métodos sin cuerpo, para decir, este objeto tiene estos métodos pero su implementación varia entre sus herederos. Para impedir que se sobreescriba un método es necesario escribir Final.
	
