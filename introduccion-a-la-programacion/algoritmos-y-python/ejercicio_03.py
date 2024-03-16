# Hacer un programa que pida el radio R de una
# circunferencia, y calcule la longitud y el área.
# Longitud = 2 * Π * R
# Área = Π * R ** 2

radio = float(input("Ingrese el radio de una circunferencia\n"))

longitud = 2 * 3.14 * radio
area = 3.14 * (radio**2)

print("La longitud es de " + str(longitud) + ", y el area es de " + str(area))
