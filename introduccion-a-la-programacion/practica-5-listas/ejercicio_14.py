# Definir una función llamada interseccion que tome
# dos listas sin repetidos y devuelva una nueva lista
# que contenga sólamente aquellos elementos que estén
# ambas listas


def interseccion(lista1, lista2):
    nuevaLista = []

    for elemento in lista1:
        if elemento in lista2:
            nuevaLista.append(elemento)

    return nuevaLista


print(interseccion([1, 2, 3, 4, 5], [3, 4, 5, 6, 7]))
