Algoritmo sin_titulo
Definir frase Como Caracter
Escribir "escribe una frase para contar palabras"
Leer frase
Definir contador, i Como Entero
contador <- 0
Para i<-0 Hasta Longitud(frase) Con Paso 1 Hacer
	Si Subcadena(frase,i,i)= " " Entonces
		contador <- contador+1
	FinSi
Fin Para
Escribir contador+1
FinAlgoritmo
