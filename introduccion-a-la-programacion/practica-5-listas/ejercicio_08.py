# Hacer una función que tome una lista de números decimales
# y devuelva el promedio de los elementos.


def devolverPromedio(listaDeDecimales):
    sumaDeDecimales = 0

    for elemento in listaDeDecimales:
        sumaDeDecimales += elemento

    return sumaDeDecimales / len(listaDeDecimales)


print(devolverPromedio([2.5, 5, 2.5]))
print(devolverPromedio([2.5, 5, 1.5, 1.0]))
