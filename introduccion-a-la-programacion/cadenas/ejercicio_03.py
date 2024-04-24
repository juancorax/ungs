# Hacer un programa que dados un caracter
# y una cadena indique la cantidad de
# apariciones de dicho caracter en la cadena.

cadena = input("Ingrese una cadena:\n")
caracter_usuario = input("¿Que caracter queres que cuente?:\n")
cantidad_del_caracter = 0

for caracter in cadena:
    if caracter == caracter_usuario:
        cantidad_del_caracter += 1

print("La cantidad de letras a que tiene la cadena es:", cantidad_del_caracter)
