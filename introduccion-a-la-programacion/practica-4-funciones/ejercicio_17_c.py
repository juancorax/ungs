# una función que se llame dameRepetida
# que tome una cadena como parámetro y
# retorne la primer letra que aparece
# repetida en la cadena


def dameRepetida(cadena):
    letras_no_repetidas = []

    for letra in cadena:
        if letra == " ":
            continue

        if letra in letras_no_repetidas:
            return "La primer letra repetida es: " + letra

        letras_no_repetidas.append(letra)

    return "No hay letras repetidas en la cadena"


cadena_del_usuario = input("Ingrese una cadena:\n")

print(dameRepetida(cadena_del_usuario))
