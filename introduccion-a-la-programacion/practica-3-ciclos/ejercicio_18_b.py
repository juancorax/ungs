# b) Ídem anterior pero deberá frenarse
# cuando el lado izquierdo pase a ser
# más grande que el derecho.

m = int(input("Ingrese un número para 'm':\n"))
n = int(input("Ingrese un número para 'n':\n"))

i = m
variableAuxiliar1 = m
j = n
variableAuxiliar2 = n
while i <= variableAuxiliar2 and j >= variableAuxiliar1:
    if i > j:
        break

    print(i, j)
    i += 1
    j -= 1
