# Hacer un programa que solicite al usuario
# un número entero positivo e indique cuál es el
# número primo mayor más cercano. Usar funciones.
# Por ejemplo, si el usuario ingresa 24, el
# programa devolverá 29
# (29 es el número primo más cercano mayor que 24).
# Si el usuario ingresa 5 el programa devolverá 7.


def numero_mas_cercano(numero, array_de_primos):
    mas_cercano = numero

    for elemento in array_de_primos:
        if mas_cercano > (abs(elemento - numero)):
            mas_cercano = elemento

    return mas_cercano


def es_primo(numero):
    if numero <= 1:
        return False

    for i in range(2, numero):
        if numero % i == 0:
            return False

    return True


def primo_mayor_mas_cercano(numero):
    numeros_primos = []

    i = 2
    while True:
        if es_primo(i):
            numeros_primos.append(i)

        i += 1

        if numeros_primos[-1] > numero:
            break

    return numero_mas_cercano(numero, numeros_primos)


numero_del_usuario = int(input("Ingrese un numero entero:\n"))

print(
    "El numero primo mayor mas cercano es:", primo_mayor_mas_cercano(numero_del_usuario)
)
