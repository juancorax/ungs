# Hacer una función que reciba una lista y devuelva
# otra solo con los elementos sin repeticiones.


def descartar_repetidos(lista):
    nueva_lista = []

    for elemento in lista:
        if elemento not in nueva_lista:
            nueva_lista.append(elemento)

    return nueva_lista


print(descartar_repetidos([1, 1, 1, 3, 4, 4, 5]))
