# Escribir un programa que le
# pida al usuario dos números.
# Devuelve el primer número
# elevado al segundo.

primerNumero = int(input("Ingrese un número:\n"))
segundoNumero = int(input("Ingrese otro número:\n"))

potencia = 1

for i in range(potencia, segundoNumero + 1):
    potencia *= primerNumero

print(primerNumero, "elevado a", segundoNumero, "es igual a", potencia)
