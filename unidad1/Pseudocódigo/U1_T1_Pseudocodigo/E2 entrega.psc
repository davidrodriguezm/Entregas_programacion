Algoritmo sin_titulo
Definir digito,l, i, posicion Como Entero
Definir num Como Caracter	
Escribir "escribe el numero"
Leer num
Escribir "escribe la posicion del numero a sustituir"
Leer posicion
Escribir "escribe el nuevo valor"
Leer digito
l<-Longitud(num)
Para i<-0 Hasta l Con Paso 1 Hacer
	Si i=posicion Entonces
		Escribir Sin Saltar digito
	SiNo
		Escribir Sin Saltar Subcadena(num,i,i)
	Fin Si
Fin Para
Escribir ""
FinAlgoritmo
