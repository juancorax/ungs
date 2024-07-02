# Haga un programa que le pida al usuario un número entre 0 y 100
# y el monto de su apuesta. El programa deberá generar un número
# al azar entre 0 y 100, comprobar si el número al que apostó el
# usuario coincide con el generado al azar y de ser así deberá
# multiplicar la apuesta por 70 e informar al usuario el monto
# ganado o, en su defecto, que siga participando.

import random

resultado = random.randint(0, 100)

numero_elegido = int(input("Elija un numero entre 0 y 100: "))
monto_a_apostar = int(input("Ingrese el monto a apostar: $ "))

print("El numero ganador es:", resultado)

if resultado == numero_elegido:
    print("Ha ganado $", monto_a_apostar * 70)
else:
    print("Ha perdido. Siga participando!")
