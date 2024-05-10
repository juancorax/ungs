# Escribir una función llamada frecuencia que tome
# una lista de enteros s y otro entero n como
# parametros y devuelva la cantidad de veces
# que aparece n en s.


def frecuencia(s, n):
    cantidadDeApariciones = 0

    for elemento in s:
        if elemento == n:
            cantidadDeApariciones += 1

    return cantidadDeApariciones


print(frecuencia([1, 2, 1, 4, 1], 1))
print(frecuencia([1, 2, 3, 4, 5], 6))
