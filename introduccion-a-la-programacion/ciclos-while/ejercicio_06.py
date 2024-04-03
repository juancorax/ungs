# Realizar un programa que
# sume los primeros n números
# impares.
# (n lo indica el usuario)
#
# Ejemplo: para n=7 debe dar
# el resultado de 1+3+5+7+9+11+13

n = int(input("Ingrese un número entero:\n"))

cantidadDeImpares = 0
sumaDeImpares = 0

i = 0
while cantidadDeImpares < n:
    if i % 2 != 0:
        sumaDeImpares += i
        cantidadDeImpares += 1

    i += 1

print(sumaDeImpares)
