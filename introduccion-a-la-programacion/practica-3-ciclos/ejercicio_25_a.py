# a) Sabiendo que la pantalla de la consola
# tiene 80 caracteres de ancho, hacer un
# programa que, dada una palabra,
# la escriba en el centro de la pantalla.

palabra_del_usuario = input("Ingrese una palabra:\n")
cantidad_de_espacios = 80 - len(palabra_del_usuario)
espacios_por_lado = (cantidad_de_espacios // 2) * " "

if cantidad_de_espacios % 2 == 0:
    print(espacios_por_lado + palabra_del_usuario + espacios_por_lado)
else:
    print(espacios_por_lado + " " + palabra_del_usuario + espacios_por_lado)
