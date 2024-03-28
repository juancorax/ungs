# Escribe un programa que pida los coeficientes
# de una ecuación de primer grado (ax + b = 0)
# y escriba la solución.
# Recuerda que una ecuación de primer grado
# puede no tener solución, tener una solución única,
# o que todos los números reales sean solución.

a = int(input("Ingrese el coeficiente 'a':\n"))
b = int(input("Ingrese el coeficiente 'b':\n"))

if a == 0:
    print("No tiene solución")
elif b == 0:
    print("Todos los números reales son solución")
else:
    x = -(b / a)
    print("x =", x)
