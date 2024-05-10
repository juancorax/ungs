# Hacer una función que recibe una lista y un entero
# e indique si el entero está en la lista.


def numero_en_lista(lista, numero_entero):
    esta_en_lista = False

    for elemento in lista:
        if elemento == numero_entero:
            esta_en_lista = True

    if esta_en_lista:
        print("El numero esta en la lista")
    else:
        print("El numero no esta en la lista")


numero_en_lista([1, 2, 3], 1)
numero_en_lista([1, 2, 3], 4)
