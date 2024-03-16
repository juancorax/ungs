# Escribir en Python un programa que pida al usuario
# que ingrese tres valores y los guarde en tres
# variables, x, y, y z.
# El programa deberá intercambiar circularmente
# los valores de x, y y z, es decir,
# x debe tomar el valor de y, y el de z y z el de x.
# Y luego mostrarlos en pantalla:
#
# El valor de x es: <x>
# El valor de y es: <y>
# El valor de z es: <z>
#
# donde en lugar de <x>, <y> y <z> deberá
# mostrarse el valor de las respectivas variables.

x = input("Ingrese el valor de x:\n")
y = input("Ingrese el valor de y:\n")
z = input("Ingrese el valor de z:\n")

a = x
x = y
y = z
z = a

print("El valor de x es: " + x)
print("El valor de y es: " + y)
print("El valor de z es: " + z)
