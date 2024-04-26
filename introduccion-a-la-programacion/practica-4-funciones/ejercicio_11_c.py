# Hacer una función que determine si un número
# ingresado por el usuario es un número abundante.
# Número abundante: todo número natural que cumple
# que la suma de sus divisores propios es mayor
# que el propio número.
# Por ejemplo, 12 es abundante ya que sus divisores
# son 1, 2, 3, 4 y 6 y se cumple que 1+2+3+4+6=16,
# que es mayor al propio 12.


def es_numero_abundante(numero):
    suma_divisores_propios = 0

    for i in range(1, numero):
        if numero % i == 0:
            suma_divisores_propios += i

    if suma_divisores_propios > numero:
        return True
    return False


numero_del_usuario = int(input("Ingrese un numero:\n"))

if es_numero_abundante(numero_del_usuario):
    print("El numero es abundante")
else:
    print("El numero no es abundante")
