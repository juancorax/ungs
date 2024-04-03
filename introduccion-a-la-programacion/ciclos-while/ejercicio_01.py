# Realizar un programa que solicite dos
# números y realice la división entre ellos,
# no se debe permitir que el denominador sea 0.

numerador = int(input("Ingrese el numerador:\n"))
denominador = int(input("Ingrese el denominador:\n"))

while denominador == 0:
    denominador = int(input("Ingrese el denominador:\n"))

division = numerador / denominador

print("El resultado de la división es:", division)
