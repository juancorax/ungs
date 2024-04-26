# Escribir una función que reciba
# como parámetro una cadena y
# la muestre en pantalla 3 veces.


def mostrar_cadena(cadena):
    for i in range(1, 4):
        print(cadena)


cadena_del_usuario = input("Ingrese una cadena:\n")

mostrar_cadena(cadena_del_usuario)
