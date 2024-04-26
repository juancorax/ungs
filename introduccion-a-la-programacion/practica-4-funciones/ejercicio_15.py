# Hacer una función (no pura) que reciba una palabra
# y la imprima recuadrada por asteriscos.
# Por ejemplo si la cadena fuera sobrevivir,
# la función debería imprimir
#
# **************
# * sobrevivir *
# **************


def recuadrada_por_asteriscos(palabra):
    largo_de_linea = len(palabra) + 4

    print(largo_de_linea * "*")
    print("*", palabra, "*")
    print(largo_de_linea * "*")


palabra_del_usuario = input("Ingrese una palabra:\n")

recuadrada_por_asteriscos(palabra_del_usuario)
