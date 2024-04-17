# f) Hacer un programa que permita
# al usuario elegir dos números positivos
# c y n y luego muestre en pantalla los
# últimos c divisores de n.

c = int(input("Ingrese un número para 'c':\n"))
n = int(input("Ingrese un número para 'n':\n"))

cantidadDeDivisores = 0

i = n
while i > 0 and cantidadDeDivisores < c:
    if n % i == 0:
        cantidadDeDivisores += 1
        print(i)
    i -= 1
