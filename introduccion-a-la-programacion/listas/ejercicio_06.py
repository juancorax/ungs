# Escribir un programa que dada una cadena y una letra,
# determine la posición de la misma en la cadena (si está
# más de una vez, debe indicar todas las posiciones que
# ocupa la letra).

cadena_del_usuario = input("Ingrese una cadena: ")
letra_del_usuario = input("Ingrese una letra: ")
posiciones_de_la_letra = []

for i in range(0, len(cadena_del_usuario)):
    if cadena_del_usuario[i] == letra_del_usuario:
        posiciones_de_la_letra.append(i)

print("Posiciones que ocupa la letra:")

for posicion in posiciones_de_la_letra:
    if posicion == posiciones_de_la_letra[len(posiciones_de_la_letra) - 1]:
        print(posicion)
    else:
        print(posicion, end=", ")
