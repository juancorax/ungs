# b) Hacer un programa que permita al usuario
#    elegir un número m y un n y luego
#    muestre todos los naturales entre m y n
#    (m, m + 1, m + 2, · · · , n − 1, n).
#    ¿Qué pasa si n es menor que m?

m = int(input("Ingrese un número 'm':\n"))
n = int(input("Ingrese un número 'n':\n"))

if n < m:
    variableAuxiliar = m
    m = n
    n = variableAuxiliar

i = m
while i <= n:
    print(i)
    i += 1
