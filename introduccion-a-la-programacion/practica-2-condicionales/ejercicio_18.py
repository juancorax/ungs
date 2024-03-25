# Una función cuadrática puede tener una, dos o ninguna raíz.
# Escribir un programa que pida al usuario los datos de la misma,
# es decir, a, b y c, y muestre todas sus raíces,
# o el mensaje "No tiene raíces" cuando corresponda.

a = int(input("Ingrese el coeficiente 'a':\n"))
b = int(input("Ingrese el coeficiente 'b':\n"))
c = int(input("Ingrese el coeficiente 'c':\n"))

discriminante = b**2 - 4 * a * c

if a == 0 or discriminante < 0:
    print("No tiene raíces")
else:
    if discriminante == 0:
        x = -b / (2 * a)
        print("x =", x)
    else:
        x1 = (-b + (discriminante) ** (1 / 2)) / (2 * a)
        x2 = (-b - (discriminante) ** (1 / 2)) / (2 * a)
        print("x1 =", x1, "\nx2 =", x2)
