Algoritmo sin_titulo
definir elmayor1, elmayor2 Como Real
Definir i,j Como Entero	
dimension datos[2,10]
elmayor<-datos[1,1]
Para i<-1 Hasta 2 Con Paso 1 Hacer
     Para j<-1 Hasta 10 Con Paso 1 Hacer
	     Escribir "introduce numero"
	     Leer datos[i,j]
		 SI datos[1,j] > elmayor1 Entonces 
			 elmayor1<-datos[1,j]
		 FinSi
		 
		 SI datos[2,j] > elmayor2 Entonces 
			 elmayor2<-datos[2,j]
		 FinSi
		 
		 FinPara
		 
 FinPara
 Escribir "el mayor del bloque primero es " elmayor1
 Escribir "el mayor del bloque segundo es " elmayor2
FinAlgoritmo
