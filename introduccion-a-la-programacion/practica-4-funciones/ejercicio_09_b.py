# Hacer una función que reciba tres enteros y retorne el mayor.


def mayor_de_tres(numero1, numero2, numero3):
    if (numero1 > numero2) and (numero1 > numero3):
        return numero1
    elif (numero2 > numero1) and (numero2 > numero3):
        return numero2
    return numero3


numero_del_usuario1 = int(input("Ingrese un numero entero:\n"))
numero_del_usuario2 = int(input("Ingrese un segundo numero entero:\n"))
numero_del_usuario3 = int(input("Ingrese un tercer numero entero:\n"))

print(
    "El mayor numero es:",
    mayor_de_tres(numero_del_usuario1, numero_del_usuario2, numero_del_usuario3),
)
