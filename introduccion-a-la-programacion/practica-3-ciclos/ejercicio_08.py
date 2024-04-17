# Es verdad que las únicas soluciones de
# x**((x+2)*(x+3)) = 1 son x = 1 x = −2 y x = −3?.
# Hacer un programa que encuentre todas las soluciones
# de 1 0 2 cifras tanto negativas como positivas.

from math import sqrt

a = int(input("ingrese un valor para a: "))
b = int(input("ingrese un valor para b: "))
c = int(input("ingrese un valor para c: "))
discriminante = b**2 - 4 * a * c

if discriminante == 0:
    print(-b / (2 * a))
elif discriminante < 0:
    print("no tiene solucion")
else:
    print(
        "tiene dos condiciones",
        -b + sqrt((b**2 - 4 * a * c) / 2 * a),
        -b - sqrt((b**2 - 4 * a * c) / 2 * a),
    )
