# Si se pone como condición que s siempre esté ordenada
# de mayor a menor, ¿cómo podría modificarse el programa
# para que haga menos iteraciones?


def cantidadMenoresQueX(s, x):
    cantidadElementosMenores = 0

    i = 0
    while s[i] < x:
        cantidadElementosMenores += 1
        i += 1

    return cantidadElementosMenores


print(cantidadMenoresQueX([1, 2, 3, 4, 5], 3.8))
print(cantidadMenoresQueX([1, 2, 3, 4, 5], 2.5))
print(cantidadMenoresQueX([1, 2, 3, 4, 5], 0.5))
