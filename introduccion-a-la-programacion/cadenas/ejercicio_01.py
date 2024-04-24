# Hacer un programa que dada una
# cadena ingresada por el usuario
# indique la cantidad de apariciones
# de la letra “a”.

cadena = input("Ingresa una cadena:\n")
cantidad_de_letras_a = 0

for caracter in cadena:
    if caracter == "a" or caracter == "A":
        cantidad_de_letras_a = cantidad_de_letras_a + 1

print("La cantidad de letras a que tiene la cadena es:", cantidad_de_letras_a)
