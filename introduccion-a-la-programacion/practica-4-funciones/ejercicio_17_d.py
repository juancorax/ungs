# una función que se llame quitarRepeticiones que
# tome dos parámetros, una cadena y una letra,
# y devuelva otra cadena igual a la anterior pero sin las
# repeticiones de esa letra.
# Por ejemplo, un programa que llame a la función así:
# quitarRepeticiones("mate cocido", "c"),
# deberá retornar la cadena "mate coido".


def quitarRepeticiones(cadena, letra):
    letras_no_repetidas = ""

    for caracter in cadena:
        if caracter == letra and caracter in letras_no_repetidas:
            continue

        letras_no_repetidas += caracter

    return letras_no_repetidas


cadena_del_usuario = input("Ingrese una cadena:\n")
letra_del_usuario = input("Ingrese una letra:\n")

print(quitarRepeticiones(cadena_del_usuario, letra_del_usuario))
