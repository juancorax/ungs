# Definir una función que tome una lista de números s
# y un número decimal x y devuelva la cantidad de
# elementos de s que sean menores que x.


def cantidadMenoresQueX(s, x):
    cantidadElementosMenores = 0

    for elemento in s:
        if elemento < x:
            cantidadElementosMenores += 1

    return cantidadElementosMenores


print(cantidadMenoresQueX([1, 2, 3, 4, 5], 3.8))
print(cantidadMenoresQueX([1, 2, 3, 4, 5], 2.5))
print(cantidadMenoresQueX([1, 2, 3, 4, 5], 0.5))
print(cantidadMenoresQueX([5, 4, 3, 2, 1], 2.5))
print(cantidadMenoresQueX([1, 4, 2, 5, 3], 1.3))
