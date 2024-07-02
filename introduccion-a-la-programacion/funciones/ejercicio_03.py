# Diseñar una función que, dada una lista de
# números enteros, devuelva el número de
# series que hay en ella. Llamamos “serie” a todo
# tramo de la lista con valores idénticos. Por
# ejemplo, la lista
# [1, 1, 8, 8, 8, 8, 0, 0, 0, 2, 10, 10]
# tiene 5 series (tener en cuenta que el 2 forma
# parte de una serie de un solo elemento).


def numeroDeSeries(lista):
    numero_de_series = 0
    elementos_no_repetidos = []

    for elemento in lista:
        if elemento not in elementos_no_repetidos:
            elementos_no_repetidos.append(elemento)
            numero_de_series += 1

    return numero_de_series


print(numeroDeSeries([1, 1, 8, 8, 8, 8, 0, 0, 0, 2, 10, 10]))
print(numeroDeSeries([4, 4, 6, 6, 1]))
print(numeroDeSeries([5]))
