# Escribir un programa que pida al usuario una cadena,
# y luego escriba en pantalla la cantidad de veces que
# aparece cada letra (sin mostrar las que no aparecen).
# Ej:
# Palabra ingresada: "conocido"
#
# c : 2
# o : 3
# n : 1
# i : 1
# d : 1


def contarLetras(cadena):
    letrasNoRepetidas = []

    for letra in cadena:
        if letra not in letrasNoRepetidas:
            letrasNoRepetidas.append(letra)

            contador = 0

            for i in range(0, len(cadena)):
                if cadena[i] == letra:
                    contador += 1

            print(letra, ":", contador)


contarLetras("conocido")
