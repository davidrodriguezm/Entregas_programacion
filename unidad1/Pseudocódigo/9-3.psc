Algoritmo sin_titulo
Definir suma,i Como Entero
Definir media Como Real
dimension datos[5]
suma<-0
Para i<-1 Hasta 5 Con Paso 1 Hacer
	Escribir "introduce numero"
	Leer datos[i]
FinPara
Para i<-1 Hasta 5 Con Paso 1 Hacer
	suma <- suma + datos[i]
Fin Para
media<-(suma/5)
Escribir "la media es " media
Para i<-1 Hasta 5 Con Paso 1 Hacer
	SI datos[i] > media
		Escribir "mayores " datos[i]
	FinSi
	
Fin Para
	
FinAlgoritmo
