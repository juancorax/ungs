# Hacer un programa que solicite dos números e indique el
# signo de la multiplicación sin efectuarla.

numeroSolicitado1 = int(input("Ingrese un número:\n"))
numeroSolicitado2 = int(input("Ingrese otro número:\n"))

if numeroSolicitado1 * numeroSolicitado2 >= 0:
    print("El signo de la multiplicación es positivo")
else:
    print("El signo de la multiplicación es negativo")
