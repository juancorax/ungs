# Se tiene la siguiente lista con DNIs de personas:
#
# 30612453
# 23763290
# 21448503
# 34582048
# 15364857
#
# Dado otro número de DNI cualquiera,
# se desea construir un programa que determine
# si es alguno de los existentes en el listado.
# Escribir el programa en papel y luego pasarlo a Python.

dni = int(input("Ingrese un DNI:\n"))

if (
    dni == 30612453
    or dni == 23763290
    or dni == 21448503
    or dni == 34582048
    or dni == 15364857
):
    print("Es uno de los existentes en el listado")
else:
    print("No es uno de los existentes en el listado")
