# Hacer un programa que dada
# una cadena ingresada por el
# usuario indique la cantidad
# de vocales.

cadena = input("Ingresa una cadena:\n")
cantidad_de_vocales = 0

for caracter in cadena:
    if (
        caracter == "a"
        or caracter == "e"
        or caracter == "i"
        or caracter == "o"
        or caracter == "u"
    ):
        cantidad_de_vocales = cantidad_de_vocales + 1

print("La cantidad de vocales que tiene la cadena es:", cantidad_de_vocales)
