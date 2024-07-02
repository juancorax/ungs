# Diseñar una función que reciba una cadena y
# devuelva TRUE si empieza con minúscula y FALSE
# en caso contrario.


def empiezaConMinuscula(cadena):
    resultado = False

    if cadena[0] == cadena[0].upper():
        resultado = True

    return resultado


cadena_del_usuario = input("Ingrese una cadena: ")

print(empiezaConMinuscula(cadena_del_usuario))
