# Hacer una función (no pura) que reciba un entero
# e imprima sus factores primos.
# Por ejemplo para a = 20 la función debe mostrar 2 y 5


def es_primo(numero):
    if numero <= 1:
        return False

    for i in range(2, numero):
        if numero % i == 0:
            return False

    return True


def factores_primos(numero):
    array_factores_primos = []

    for i in range(1, numero + 1):
        if (numero % i == 0) and (es_primo(i)):
            array_factores_primos.append(i)

    for factor_primo in array_factores_primos:
        print(factor_primo)


numero_del_usuario = int(input("Ingrese un numero entero:\n"))

factores_primos(numero_del_usuario)
