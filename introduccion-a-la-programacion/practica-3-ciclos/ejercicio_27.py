# Hacer un programa que dada
# una palabra y una letra,
# imprima la cantidad de apariciones
# de esa letra.

palabra_del_usuario = input("Ingrese una palabra:\n")
letra_del_usuario = input("Ingrese una letra:\n")
APARICIONES_DE_LA_LETRA = 0

for letra in palabra_del_usuario:
    if letra == letra_del_usuario:
        APARICIONES_DE_LA_LETRA += 1

print(APARICIONES_DE_LA_LETRA)
