# Escribir un programa que pida al usuario tres
# enteros y los guarde en tres variables a, b y c.
# El programa deberá luego hacer que en la
# variable a quede el menor de los valores recibidos,
# en b el intermedio y en c el mayor
# (es decir, ordenará los valores).

a = int(input('Ingrese el número entero "a":\n'))
b = int(input('Ingrese el número entero "b":\n'))
c = int(input('Ingrese el número entero "c":\n'))

if c < a:
    variableAuxiliar = c
    c = a
    a = variableAuxiliar

if a > b:
    variableAuxiliar = a
    a = b
    b = variableAuxiliar

if b > c:
    variableAuxiliar = b
    b = c
    c = variableAuxiliar

print("a:", a)
print("b:", b)
print("c:", c)
