# Escribir una función que reciba
# dos números reales como parámetros
# y retorne su promedio


def promedio(numero1, numero2, numero3):
    return (numero1 + numero2 + numero3) / 3


numero_usuario_1 = float(input("Ingrese un numero real:\n"))
numero_usuario_2 = float(input("Ingrese otro numero real:\n"))
numero_usuario_3 = float(input("Ingrese otro numero real:\n"))

print(promedio(numero_usuario_1, numero_usuario_2, numero_usuario_3))
