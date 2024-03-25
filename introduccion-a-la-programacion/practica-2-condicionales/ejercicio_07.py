# Escribir en papel un programa que pida
# al usuario dos números de punto flotante
# y muestre su promedio.
# Además, si el promedio es mayor que 7
# el programa debe mostrar en pantalla
# "Aprobado" y si no, debe mostrar "Desaprobado".
# Después de hacerlo en papel, pasarlo a Python.

numero1 = float(input("Ingrese un número:\n"))
numero2 = float(input("Ingrese otro número:\n"))

promedio = (numero1 + numero2) / 2

if promedio > 7:
    print("Aprobado")
else:
    print("Desaprobado")
