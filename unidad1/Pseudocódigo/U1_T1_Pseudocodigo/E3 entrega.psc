Algoritmo sin_titulo
Escribir "introduce la altura"
Definir num Como Entero
Leer num
Si num>3 Entonces
	Para fila<-num Hasta 1 Con Paso -1 Hacer
		Para columna<-1 Hasta fila Con Paso 1 Hacer
			Escribir Sin Saltar "*"
		FinPara
	Escribir ""	
    Fin Para
	Para fila<-2 Hasta num Con Paso 1 Hacer
		Para columna<-1 Hasta fila Con Paso 1 Hacer
			Escribir Sin Saltar "*"
		FinPara
		Escribir ""	
    Fin Para
	
SiNo
	Escribir "error número no impar mayor o igual a 3"
Fin Si
	
FinAlgoritmo
