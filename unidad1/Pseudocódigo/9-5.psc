Algoritmo sin_titulo
Definir i, elmayor Como Entero
dimension datos[7]
Para i<-1 Hasta 7 Con Paso 1 Hacer
	Escribir "introduce numero"
	Leer datos[i]
FinPara
elmayor<-datos[1]
Para i<-1 Hasta 7 Con Paso 1 Hacer
	Si datos[i] > elmayor Entonces
		elmayor<-datos[i]
	FinSi
Fin Para
Escribir "el mayor es " elmayor
FinAlgoritmo
