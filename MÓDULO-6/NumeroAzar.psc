Algoritmo NumeroAzar
	i<-1
	Mientras i <= 5 Hacer
		numAzar<-azar(11)
		Escribir "Ingrese un n�mero del 0 al 10"
		Leer numeroIngresado
		Si numAzar == numeroIngresado Entonces
			Escribir "Ganaste...!"
			i<-6
		SiNo
			Escribir "No es el n�mero :c"
			i<-i + 1
		Fin Si
	Fin Mientras
FinAlgoritmo
