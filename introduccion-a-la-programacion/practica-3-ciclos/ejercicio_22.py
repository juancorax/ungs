# Hacer un programa que permita
# al usuario jugar al piedra,
# papel o tijera contra la computadora.
# Se debe jugar al mejor de 5, es decir,
# si uno de los participantes consigue
# 3 victorias el juego termina.

import random

puntajeDelUsuario = 0
puntajeDeLaComputadora = 0

i = 0
while i < 5:
    numeroEntre1Y3Inclusive = random.randint(1, 3)

    eleccionDelUsuario = input("Elija 'piedra', 'papel' o 'tijera':\n")

    if numeroEntre1Y3Inclusive == 1:
        eleccionDeLaComputadora = "piedra"
    elif numeroEntre1Y3Inclusive == 2:
        eleccionDeLaComputadora = "papel"
    elif numeroEntre1Y3Inclusive == 3:
        eleccionDeLaComputadora = "tijera"

    if eleccionDelUsuario == eleccionDeLaComputadora:
        print("Empate\n")
    elif eleccionDelUsuario == "piedra" and eleccionDeLaComputadora == "tijera":
        print("Ganaste, piedra le gana a tijera\n")
        puntajeDelUsuario += 1
    elif eleccionDelUsuario == "tijera" and eleccionDeLaComputadora == "papel":
        print("Ganaste, tijera le gana a papel\n")
        puntajeDelUsuario += 1
    elif eleccionDelUsuario == "papel" and eleccionDeLaComputadora == "piedra":
        print("Ganaste, papel le gana a piedra\n")
        puntajeDelUsuario += 1
    elif eleccionDeLaComputadora == "piedra" and eleccionDelUsuario == "tijera":
        print("Perdiste, piedra le gana a tijera\n")
        puntajeDeLaComputadora += 1
    elif eleccionDeLaComputadora == "tijera" and eleccionDelUsuario == "papel":
        print("Perdiste, tijera le gana a papel\n")
        puntajeDeLaComputadora += 1
    elif eleccionDeLaComputadora == "papel" and eleccionDelUsuario == "piedra":
        print("Perdiste, papel le gana a piedra\n")
        puntajeDeLaComputadora += 1

    i += 1

if puntajeDelUsuario > puntajeDeLaComputadora:
    print("Sos el ganador!")
elif puntajeDelUsuario < puntajeDeLaComputadora:
    print("Sos el perdedor!")
else:
    print("Es un empate!")
