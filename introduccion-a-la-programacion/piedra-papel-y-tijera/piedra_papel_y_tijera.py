# Hacer un programa que permita jugar contra
# la computadora a este conocido juego.
# Informar al finalizar, quien gana o si hay empate...

import random

puntaje_del_jugador = 0
puntaje_de_computadora = 0
turno = 1

while turno <= 3:
    decisiones_posibles = ["piedra", "papel", "tijera"]

    decision_de_computadora = random.choice(decisiones_posibles)
    decision_del_jugador = ""

    jugador_no_eligio = True
    while jugador_no_eligio:
        decision_del_jugador = input(
            "Elija entre 'piedra', 'papel' o 'tijera': "
        ).lower()

        if decision_del_jugador in decisiones_posibles:
            jugador_no_eligio = False

    if decision_del_jugador == decision_de_computadora:
        print("Empate. Ninguno gana un punto.")
    elif decision_del_jugador == "piedra" and decision_de_computadora == "tijera":
        print("Piedra le gana a Tijera. Punto para el jugador.")
        puntaje_del_jugador += 1
    elif decision_del_jugador == "papel" and decision_de_computadora == "piedra":
        print("Papel le gana a Piedra. Punto para el jugador.")
        puntaje_del_jugador += 1
    elif decision_del_jugador == "tijera" and decision_de_computadora == "papel":
        print("Tijera le gana a Papel. Punto para el jugador.")
        puntaje_del_jugador += 1
    elif decision_de_computadora == "piedra" and decision_del_jugador == "tijera":
        print("Piedra le gana a Tijera. Punto para la computadora.")
        puntaje_de_computadora += 1
    elif decision_de_computadora == "papel" and decision_del_jugador == "piedra":
        print("Papel le gana a Piedra. Punto para la computadora.")
        puntaje_de_computadora += 1
    elif decision_de_computadora == "tijera" and decision_del_jugador == "papel":
        print("Tijera le gana a Papel. Punto para la computadora.")
        puntaje_de_computadora += 1

    turno += 1

if puntaje_del_jugador > puntaje_de_computadora:
    print("El jugador ha ganado!", puntaje_del_jugador, "a", puntaje_de_computadora)
elif puntaje_de_computadora > puntaje_del_jugador:
    print("La computadora ha ganado!", puntaje_de_computadora, "a", puntaje_del_jugador)
else:
    print("Empate! Ninguno gana!")
