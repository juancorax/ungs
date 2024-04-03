# Realizar un programa que
# sume los primeros números
# impares hasta n.
# (n lo indica el usuario) 1+3+5+…+n=

n = int(input("Ingrese un número entero:\n"))

sumaDeImpares = 0

i = 1
while i <= n:
    if i % 2 != 0:
        sumaDeImpares = sumaDeImpares + i

    i = i + 1

print(sumaDeImpares)
