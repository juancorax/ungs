# Hacer un programa que simule
# el juego de la quiniela.
# El usuario debe elegir un número
# del 0 al 99 y un monto a apostar,
# si acierta el número gana 70 veces
# lo apostado.
# (El número de la suerte debe ser
# elegido al azar)

import random

numeroElegido = int(input("Ingrese un número del 0 al 99:\n"))
montoAApostar = int(input("Ingrese el monto a apostar:\n$ "))

resultadoDeQuiniela = random.randint(0, 99)

if numeroElegido == resultadoDeQuiniela:
    print("Ganaste: $", montoAApostar * 70)
else:
    print("Perdiste, suerte la próxima!")
