# Hacer que programa que dado un número indique si es Perfecto.


def esPerfecto(numero):
    es_perfecto = False
    suma_de_divisores_propios = 0

    for i in range(1, numero):
        if numero % i == 0:
            suma_de_divisores_propios += i

    if numero == suma_de_divisores_propios:
        es_perfecto = True

    return es_perfecto


print(esPerfecto(6))
print(esPerfecto(4))
print(esPerfecto(28))
print(esPerfecto(8128))
