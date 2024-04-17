# Escribir un programa que le
# pregunte al usuario un número
# entero positivo N, y que muestre
# por pantalla la cantidad de
# cifras que tiene.
# (Ej: 1492 tiene 4 cifras)

numeroSolicitado = int(input("Ingrese un número positivo N:\n"))
cantidadDeCifras = 1

i = 1
while numeroSolicitado > i:
    i *= 10
    cantidadDeCifras += 1

print("Tiene", cantidadDeCifras - 1, "cifra(s)")
