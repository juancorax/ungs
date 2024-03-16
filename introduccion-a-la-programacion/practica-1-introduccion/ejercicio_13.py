# Suponga que una persona desea invertir su capital en un banco
# y quiere saber cuánto dinero tendrá en su cuenta si el banco
# incrementa el 6 % mensual (no acumulativo).
# Se le debe pedir al usuario el capital a invertir y la cantidad de meses.
# Por ejemplo, si invierte 500 mil pesos por 4 meses
# el banco debería devolverle 620 mil pesos.

capitalDeInversion = float(input("Ingrese el capital de inversion\n"))
cantidadDeMeses = int(input("Ingrese la cantidad de meses\n"))

incrementoMensual = 6 * capitalDeInversion / 100

dineroEnCuenta = capitalDeInversion + (incrementoMensual * cantidadDeMeses)

print(dineroEnCuenta)
