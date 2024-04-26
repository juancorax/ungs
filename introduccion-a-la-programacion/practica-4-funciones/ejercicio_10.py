# Hacer una función potencia,
# que reciba dos enteros a y b
# y retorne a**b


def potencia(a, b):
    return a**b


numero_del_usuario1 = int(input("Ingrese un numero:\n"))
numero_del_usuario2 = int(input("Ingrese otro numero:\n"))

print(
    numero_del_usuario1,
    "elevado a",
    numero_del_usuario2,
    "es igual a",
    potencia(numero_del_usuario1, numero_del_usuario2),
)
