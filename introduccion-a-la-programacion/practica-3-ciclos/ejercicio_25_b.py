# b) Hacer una programa que,
# dada una palabra,
# la escriba pegada a la derecha
# de la pantalla.

palabra_del_usuario = input("Ingrese una palabra:\n")
cantidad_de_espacios = 80 - len(palabra_del_usuario)

print(cantidad_de_espacios * " " + palabra_del_usuario)
