# Escribir una función que tome un parámetro
# de tipo entero y devuelva la cantidad
# de divisores positivos de ese número.


def cantidad_divisores_positivos(numero):
    suma_divisores = 0

    for i in range(1, numero + 1):
        if numero % i == 0:
            suma_divisores += i

    return suma_divisores


numero_del_usuario = int(input("Ingrese un numero entero:\n"))

print(cantidad_divisores_positivos(numero_del_usuario))
