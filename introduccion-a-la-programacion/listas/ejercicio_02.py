#  Hacer una función que dado un entero y una lista
# de enteros indique cuantas veces aparece el
# entero en la lista


def imprimir_apariciones(numero_entero, lista):
    apariciones = 0

    for elemento in lista:
        if elemento == numero_entero:
            apariciones += 1

    print("El numero aparece", apariciones, "veces en la lista")


imprimir_apariciones(5, [1, 2, 5, 6, 5])
imprimir_apariciones(5, [1, 2, 3, 4])
