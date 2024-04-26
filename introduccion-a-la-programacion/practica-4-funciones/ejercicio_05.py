# Definir una función que devuelva
# el valor absoluto de un número.
# (Hacerlo sin utilizar la función abs)


def valor_absoluto(numero):
    if numero < 0:
        return numero * (-1)
    return numero


numero_del_usuario = float(input("Ingrese un numero:\n"))

print("Su valor absoluto es:", valor_absoluto(numero_del_usuario))
