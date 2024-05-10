# Hacer una función que reciba una lista de enteros
# y devuelva el máximo.


def devolver_maximo(lista_de_enteros):
    numero_maximo = lista_de_enteros[0]

    for elemento in lista_de_enteros:
        if elemento > numero_maximo:
            numero_maximo = elemento

    return numero_maximo


print(devolver_maximo([1, 2, 3, 4, 5]))
print(devolver_maximo([5, 4, 3, 2, 1]))
print(devolver_maximo([5, 1, 9, 0, -1]))
