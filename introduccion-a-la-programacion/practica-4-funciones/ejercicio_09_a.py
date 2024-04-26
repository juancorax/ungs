# Hacer una función que reciba dos enteros y retorne el mayor


def mayor_de_dos(numero1, numero2):
    if numero1 > numero2:
        return numero1
    return numero2


numero_del_usuario1 = int(input("Ingrese un numero entero:\n"))
numero_del_usuario2 = int(input("Ingrese un segundo numero entero:\n"))

print("El mayor numero es:", mayor_de_dos(numero_del_usuario1, numero_del_usuario2))
