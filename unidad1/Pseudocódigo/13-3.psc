Proceso e133
	Definir num como entero
	Escribir "escribe un numero par"
	leer num
	escribir EsPar(num)
FinProceso
SubProceso resultado <- Espar(num)
	Definir resultado Como logico
	
	si num%2=0
		resultado <- Verdadero
	SiNo
		resultado <- Falso
	FinSi
FinSubProceso 