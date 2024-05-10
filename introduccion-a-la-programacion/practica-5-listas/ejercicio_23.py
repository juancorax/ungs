# Modificar el programa del ejercicio 22 para que
# muestre visualmente los resultados, repitiendo
# asteriscos.
#
# Ej:
# Palabra ingresada: "conocido"
#
# c : **
# o : ***
# n : *
# i : *
# d : *


def contarLetras(cadena):
    letrasNoRepetidas = []

    for letra in cadena:
        if letra not in letrasNoRepetidas:
            letrasNoRepetidas.append(letra)

            contador = 0

            for i in range(0, len(cadena)):
                if cadena[i] == letra:
                    contador += 1

            print(letra, ":", contador * "*")


contarLetras("conocido")
