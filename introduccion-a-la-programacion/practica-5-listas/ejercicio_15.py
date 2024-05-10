# Definir una función llamada union que tome dos listas
# sin repetidos y devuelva una nueva lista que contenga
# los elementos de ambas listas.
# Ojo, la lista de retorno debe no tener repetidos.


def union(lista1, lista2):
    nuevaLista = lista1

    for elemento in lista2:
        if elemento not in nuevaLista:
            nuevaLista.append(elemento)

    return nuevaLista


print(union([1, 2, 3, 4], [3, 4, 5, 6, 7]))
