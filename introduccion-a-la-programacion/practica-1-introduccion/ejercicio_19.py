# Escribir en Python un programa que pida
# al usuario que ingrese dos valores
# y los guarde en dos variables, x e y.
# El programa deberá intercambiar los valores
# de x e y y luego mostrar en pantalla:
#
# El valor de x es: <x>
# El valor de y es: <y>
#
# donde en lugar de <x> e <y> deberá mostrarse
# el valor de las respectivas variables.

x = input("Ingrese el valor de x:\n")
y = input("Ingrese el valor de y:\n")

z = x
x = y
y = z

print("El valor de x es: " + x)
print("El valor de y es: " + y)
