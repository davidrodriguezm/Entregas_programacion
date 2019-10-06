Proceso sin_titulo
	Definir tex como caracter
	Escribir " escribe un texto"
	leer tex
	EscribirCentrado(tex)
FinProceso
SubProceso EscribirCentrado(tex)
	Definir x,espacios Como Entero
	espacios <-redon(longitud(tex)/2)
	
	para x <-0 Hasta 40-espacios
		Escribir Sin Saltar " " 
	FinPara
	Escribir tex
FinSubProceso 