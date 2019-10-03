Algoritmo sin_titulo
definir num, intento, clave Como Entero
clave<-azar (101)
Escribir "adivina el numero"
intento<-0
Repetir
	Leer num
	intento<-intento+1
	Si num < clave Entonces
		Escribir "el numero es mas grande"
	Fin Si
	Si num > clave Entonces
		Escribir "el numero es mas pequeño"
	Fin Si
Hasta Que intento = 7 o num = clave 
Si num = clave Entonces
	Escribir "correcto"
SiNo
	Escribir "se agotaron los intentos"
Fin Si
FinAlgoritmo 