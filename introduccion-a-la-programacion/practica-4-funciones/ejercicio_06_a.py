# Escribir una función con el siguiente encabezado:
# def exclamar(unaCadena):
# que retorne la misma cadena entre símbolos de exclamación


def exclamar(cadena):
    return "¡" + cadena + "!"


cadena_del_usuario = input("Ingrese una cadena:\n")

print(exclamar(cadena_del_usuario))
