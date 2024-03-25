# Escribir un programa que pida al usuario
# dos enteros y que luego muestre si el primero
# es mayor que el segundo o viceversa.

numeroEntero1 = int(input("Ingrese un número entero:\n"))
numeroEntero2 = int(input("Ingrese otro número entero\n"))

if numeroEntero1 > numeroEntero2:
    print("El mayor es:", numeroEntero1)
else:
    print("El mayor es:", numeroEntero2)
