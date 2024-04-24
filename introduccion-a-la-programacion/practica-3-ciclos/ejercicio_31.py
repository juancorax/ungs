# Hacer un programa que solicite dos cadenas,
# nombre y apellido y arme el legajo de estudiantes
# de la universidad de la siguiente manera:
# Los 3 primeros números del legajo coinciden
# con los primeros del dni luego "_",
# luego las 3 primeras letras del apellido
# y por ultimo la primera y ultima del nombre.
# Por ejemplo:
# JavierRodriguez 38946702
# Legajo: 389_rodjr

nombre_del_usuario = input("Ingrese su nombre:\n")
apellido_del_usuario = input("Ingrese su apellido:\n")
dni_del_usuario = input("Ingrese su dni:\n")
LEGAJO = ""
COPIA_DEL_NOMBRE = ""

for numero in dni_del_usuario:
    if len(LEGAJO) < 3:
        LEGAJO += str(numero)

LEGAJO += "_"

for letra in apellido_del_usuario:
    if len(LEGAJO) < 7:
        LEGAJO += letra

for letra in nombre_del_usuario:
    if (len(COPIA_DEL_NOMBRE) == 0) or (
        (len(COPIA_DEL_NOMBRE)) == (len(nombre_del_usuario) - 1)
    ):
        LEGAJO += letra

    COPIA_DEL_NOMBRE += letra

print(LEGAJO)
