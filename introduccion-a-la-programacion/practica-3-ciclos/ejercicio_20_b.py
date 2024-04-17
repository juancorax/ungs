# b) Cambiar el programa para que
# use sólo un ciclo en vez de dos.

m = int(input("Ingrese un número para 'm':\n"))
n = int(input("Ingrese un número para 'n':\n"))

i = m
j = m

while i <= n:
    print(i, j)
    if j == n:
        j = m
        i += 1
    else:
        j += 1
