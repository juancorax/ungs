# Una función que se llame aparece que tome dos parámetros,
# una letra y una cadena, y devuelva True si la letra
# aparece en la cadena y False en caso contrario.


def aparece(letra, cadena):
    return letra in cadena


letra_del_usuario = input("Ingrese una letra:\n")
cadena_del_usuario = input("Ingrese una cadena:\n")

if aparece(letra_del_usuario, cadena_del_usuario):
    print("La letra aparece en la cadena")
else:
    print("La letra no aparece en la cadena")
