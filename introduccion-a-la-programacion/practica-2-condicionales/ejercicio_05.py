# Escribir en papel un programa que pida una nota
# y que en el caso de que sea menor a cuatro
# muestre "Debe recuperar". Luego pasarlo a Python.

notaSolicitada = int(input("Ingrese una nota:\n"))

if notaSolicitada < 4:
    print("Debe recuperar")
