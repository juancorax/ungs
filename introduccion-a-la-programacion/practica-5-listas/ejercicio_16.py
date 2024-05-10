# Definir una función llamada diferencia que tome
# dos listas sin repetidos y devuelva una nueva lista
# que contenga los elementos la primera que no estén
# en la segunda.


def diferencia(lista1, lista2):
    nuevaLista = []

    for elemento in lista1:
        if elemento not in lista2:
            nuevaLista.append(elemento)

    return nuevaLista


print(diferencia([1, 2, 3, 4, 5], [3, 4, 5, 6, 7]))
