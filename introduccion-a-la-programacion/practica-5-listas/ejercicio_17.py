# Definir una función llamada mcd que tome dos enteros
# positivos y devuelva el máximo común divisor usando
# funciones de los ejercicios anteriores.


def divisores(entero):
    lista_de_divisores = []

    for i in range(1, entero + 1):
        if entero % i == 0:
            lista_de_divisores.append(i)

    return lista_de_divisores


def interseccion(lista1, lista2):
    nuevaLista = []

    for elemento in lista1:
        if elemento in lista2:
            nuevaLista.append(elemento)

    return nuevaLista


def maximo(lista):
    numeroMaximo = lista[0]

    for elemento in lista:
        if elemento > numeroMaximo:
            numeroMaximo = elemento

    return numeroMaximo


def mcd(entero1, entero2):
    divisoresDeEntero1 = divisores(entero1)
    divisoresDeEntero2 = divisores(entero2)

    interseccionDeDivisores = interseccion(divisoresDeEntero1, divisoresDeEntero2)

    return maximo(interseccionDeDivisores)


print(mcd(36, 60))
