# Definir una función llamada divisores que tome un entero
# y devuelva la lista de divisores de ese entero.


def divisores(entero):
    lista_de_divisores = []

    for i in range(1, entero + 1):
        if entero % i == 0:
            lista_de_divisores.append(i)

    return lista_de_divisores


print(divisores(1))
print(divisores(2))
print(divisores(3))
print(divisores(4))
print(divisores(5))
