# Hacer una función que sume los divisores propios de un número.


def suma_de_divisores_propios(numero):
    suma_divisores_propios = 0

    for i in range(1, numero):
        if numero % i == 0:
            suma_divisores_propios += i

    return suma_divisores_propios


numero_del_usuario = int(input("Ingrese un numero:\n"))

print(
    "La suma de los divisores propios de",
    numero_del_usuario,
    "es igual a",
    suma_de_divisores_propios(numero_del_usuario),
)
