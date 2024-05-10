# Definir una función llamada mostrarEnUnaLinea que tome
# una lista de enteros y muestre todos sus elementos
# en una linea separados por espacios.


def mostrarEnUnaLinea(listaDeEnteros):
    for elemento in listaDeEnteros:
        print(elemento, end=" ")


mostrarEnUnaLinea([1, 2, 3, 4, 5])
