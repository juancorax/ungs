# Hacer un programa que muestre los número perfectos
# que existen del 1 al 1 millón.


def esPerfecto(numero):
    es_perfecto = False
    suma_de_divisores_propios = 0

    for i in range(1, numero):
        if numero % i == 0:
            suma_de_divisores_propios += i

    if numero == suma_de_divisores_propios:
        es_perfecto = True

    return es_perfecto


for i in range(1, 1000001):
    if esPerfecto(i):
        print(i)
