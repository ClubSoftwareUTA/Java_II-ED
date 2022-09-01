Algoritmo ParesImpares
	Escribir "Ingrese número inicial del rango"
	Leer inicio
	Escribir "Ingrese número final del rango"
	Leer final
	cantidadPares<-0
	cantidadImpares<-0
	Mientras inicio <= final Hacer
		Si inicio <> 0 Entonces
		Si inicio%2 == 0 Entonces
			cantidadPares<-cantidadPares + 1
		SiNo
			cantidadImpares<-cantidadImpares + 1
		Fin Si
	Fin Si
		inicio<-inicio + 1
	Fin Mientras
	Escribir "Pares: " cantidadPares
	Escribir "Impares: " cantidadImpares
FinAlgoritmo
