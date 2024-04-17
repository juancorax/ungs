# Escribir un programa que le
# pregunte al usuario un número
# entero positivo n y que calcule
# la parte entera de la raíz
# cuadrada de n.

numeroSolicitado = int(input("Ingrese un número entero positivo:\n"))

i = 1
while i**2 <= numeroSolicitado:
    i += 1

print("La raíz cuadrada de", numeroSolicitado, "es:", i - 1)
