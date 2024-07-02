# Le debemos preguntar al cliente el nombre
# de cada producto y su precio.

# Como no sabemos
# cuántos productos
# serán, hay que ir
# preguntando si desea
# agregar más producto.

# Cuando el comprador ya
# no quiera agregar
# productos, se le debe
# informar el costo total
# de la compra, y el
# nombre del producto
# más caro.

seguir = True
costo_total = 0
producto_mas_caro = ""
precio_actual = 0
ultimo_precio = 0

while seguir:
    nombre_del_producto = input("Ingrese el nombre del producto: ")
    precio_del_producto = int(input("Ingrese el precio del producto: $ "))

    precio_actual = precio_del_producto

    costo_total += precio_del_producto

    if precio_actual > ultimo_precio:
        ultimo_precio = precio_actual
        producto_mas_caro = nombre_del_producto

    agregar_productos = input("¿Desea agregar mas productos?: ")

    if agregar_productos == "no":
        seguir = False

print("Costo total:", costo_total, "| Producto mas caro:", producto_mas_caro)
