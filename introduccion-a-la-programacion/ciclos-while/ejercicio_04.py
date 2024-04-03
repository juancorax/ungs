# Realizar un programa que sume
# los primeros n números naturales.
# (n lo indica el usuario) 1+2+3+4+…+n =

n = int(input("Ingrese un número entero:\n"))

suma = 0

i = 1
while i <= n:
    suma = suma + i
    i = i + 1

print(suma)
