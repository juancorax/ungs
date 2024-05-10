# Definir una función llamada dondeAparece que tome
# una lista de enteros y un entero llamado blanco
# como parámetros, y devuelva el primer índice donde
# blanco aparece en el arreglo, si lo hace, y -1 en
# caso contrario.


def dondeAparece(listaDeEnteros, blanco):
    for i in range(0, len(listaDeEnteros)):
        if listaDeEnteros[i] == blanco:
            return i

    return -1


print(dondeAparece([1, 2, 3, 4, 5], 4))
print(dondeAparece([1, 2, 3, 4, 5], 6))
