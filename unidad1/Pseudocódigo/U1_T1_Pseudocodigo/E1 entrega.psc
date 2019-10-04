Algoritmo sin_titulo
Definir sueldo, horas, horaextra, sueldototal, pagaex  Como Real
Escribir "¿cuantas horas trbaja?"
Leer horas
sueldo<-10
sueldo<-sueldo*horas
pagaex<-0
horaextra<-0
sueldototal<-0
Si horas>40 Entonces
	horaextra<-horas-40
	pagaex<-horaextra*5
Fin Si
sueldototal<-sueldo+pagaex
Escribir "cobra " sueldototal " euros"
FinAlgoritmo
