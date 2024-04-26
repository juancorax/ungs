# una función que se llame tieneRepetidas
# que tome una cadena como parámetro y
# devuelva True si esa cadena tiene alguna
# letra que aparece más de una vez y False
# en caso contrario.


def tieneRepetidas(cadena):
    letras_no_repetidas = []

    for letra in cadena:
        if letra == " ":
            continue

        if letra in letras_no_repetidas:
            return True

        letras_no_repetidas.append(letra)

    return False


cadena_del_usuario = input("Ingrese una cadena:\n")

if tieneRepetidas(cadena_del_usuario):
    print("Tiene letras repetidas")
else:
    print("No tiene letras repetidas")
