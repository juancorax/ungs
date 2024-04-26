# Hacer una función que indique si un número es perfecto.
# Número perfecto: a es perfecto si la suma de sus divisores
# propios es igual a a


def es_numero_perfecto(numero):
    suma_divisores_propios = 0

    for i in range(1, numero):
        if numero % i == 0:
            suma_divisores_propios += i

    if suma_divisores_propios == numero:
        return True
    return False


numero_del_usuario = int(input("Ingrese un numero:\n"))

if es_numero_perfecto(numero_del_usuario):
    print("El numero es perfecto")
else:
    print("El numero no es perfecto")
