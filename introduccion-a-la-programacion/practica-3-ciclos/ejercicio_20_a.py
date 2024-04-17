# a) Escribir un programa que permita
# al usuario elegir un número m y un n
# y muestre todos los pares de numeros
# que se pueden formar con los números
# que están entre ellos, pero esta vez
# que lo haga sin repetir inversos.
# Por ej. si el usuario ingresara 4 y 6,
# el programa deberá mostrar

m = int(input("Ingrese un número para 'm':\n"))
n = int(input("Ingrese un número para 'n':\n"))

for i in range(m, n + 1):
    for j in range(m, n + 1):
        print(i, j)
