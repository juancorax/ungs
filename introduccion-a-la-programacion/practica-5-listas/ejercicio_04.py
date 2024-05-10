# Definir una función llamada laMasCorta que tome dos listas
# y devuelva la que tenga menos elementos.
# Si tienen igual cantidad, deberá devolver la primera.


def laMasCorta(lista1, lista2):
    if len(lista1) < len(lista2):
        return lista1
    return lista2


print(laMasCorta([1, 2, 3, 4, 5], [1, 2, 3]))
print(laMasCorta([1, 2, 3], [1, 2, 3, 4, 5]))
print(laMasCorta([1, 2, 3, 4, 5], [1, 2, 3, 4, 5]))
print(laMasCorta([1, 2, 3], [1, 2, 3]))
