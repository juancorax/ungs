# Definir una funcion que tome una lista
# y devuelva True si tiene al menos un
# elemento repetido, y False en caso contrario


def tieneRepetidos(lista):
    elementosNoRepetidos = []

    for elemento in lista:
        if elemento in elementosNoRepetidos:
            return True

        elementosNoRepetidos.append(elemento)

    return False


print(tieneRepetidos([1, 2, 3, 4, 5]))
print(tieneRepetidos([1, 2, 1, 4, 5]))
print(tieneRepetidos([1, 2, 3, 4, 3]))
