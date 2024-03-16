# Hacer un programa que pida el precio unitario y la
# cantidad de productos adquiridos y calcule el
# precio final.

precioUnitario = float(input("Ingrese el precio por unidad\n"))
cantidadDeProductos = int(input("Ingrese la cantidad de productos adquiridos\n"))

precioFinal = precioUnitario * cantidadDeProductos

print(precioFinal)
