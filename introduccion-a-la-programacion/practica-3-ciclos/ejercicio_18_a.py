# a) Hacer un programa que permita
# al usuario elegir un número m y un n
# y muestre pares de numeros complementarios,
# o sea (m, n)(m + 1, n − 1)(m + 2, n − 2) . . . (n − 1, m + 1)(n, m).
# Por ejemplo, el usuario ingresa 5 y 10,
# 5 será el complementario de 10,
# 6 el de 9 y 7 el de 8, y deberá mostrarse:
#
# 5 10
# 6 9
# 7 8
# 8 7
# 9 6
# 10 5

m = int(input("Ingrese un número para 'm':\n"))
n = int(input("Ingrese un número para 'n':\n"))

i = m
variableAuxiliar1 = m
j = n
variableAuxiliar2 = n
while i <= variableAuxiliar2 and j >= variableAuxiliar1:
    print(i, j)
    i += 1
    j -= 1
