Proceso sin_titulo
	Definir n1,n2, noson Como Entero
	Escribir "escribe primer numero"
	Leer n1
	Escribir "escribe segudo numero"
	leer n2
	noson<-0
	Esmultiplo(n1,n2)
FinProceso
Funcion  Esmultiplo(n1,n2)
	si n1%n2=0 entonces
		escribir n1 " es multiplo de " n2
	SiNo
		noson<-noson+1
	FinSi
	si n2%n1=0 y n1%n2<>0 Entonces
		escribir n2 " es multiplo de " n1
	SiNo
		noson<-noson+1
	FinSi
	Si noson=2 Entonces
		escribir "no son multiplo"
	Fin Si
Finfuncion 