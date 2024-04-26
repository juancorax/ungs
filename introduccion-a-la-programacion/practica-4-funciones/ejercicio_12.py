# Hacer una función que indique
# si un número es Poderoso:
# Número poderoso: es un número
# natural n que cumple que todos
# sus divisores primos al cuadrado
# también son divisores, es decir,
# si p es un divisor primo entonces
# p**2 también lo es. Por ejemplo,
# el número 36 es un número poderoso
# ya que los únicos primos que son
# divisores suyos son 2 y 3
# y se cumple que 4 y 9 también son
# divisores de 36.


def es_primo(numero):
    if numero <= 1:
        return False

    for i in range(2, numero):
        if numero % i == 0:
            return False

    return True


def es_poderoso(numero):
    divisores_primos = []
    divisores_primos_al_cuadrado = []

    for i in range(1, numero + 1):
        if (numero % i == 0) and (es_primo(i)):
            divisores_primos.append(i)

    for divisor_primo in divisores_primos:
        if numero % (divisor_primo**2) == 0:
            divisores_primos_al_cuadrado.append(divisor_primo)

    if len(divisores_primos) == len(divisores_primos_al_cuadrado):
        return True
    return False


numero_del_usuario = int(input("Ingrese un numero entero:\n"))

if es_poderoso(numero_del_usuario):
    print("El numero es poderoso")
else:
    print("El numero no es poderoso")
