# Hacer un programa que reciba un número m
# y determine el primer n para el cual la suma
# 1+2+...+n > m.
# Por ejemplo, si el usuario ingresa 11 se deberá
# retornar 5 ya que 1+2+3+4 =
# 10 < 11 y 1 + 2 + 3 + 4 + 5 = 15 > 11

n = int(input("Ingrese un número para 'n':\n"))
suma = 0

i = 0
while suma <= n:
    suma += i
    i += 1

print(i - 1)
