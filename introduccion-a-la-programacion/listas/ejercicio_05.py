# Escribir un programa que pida una lista de números y
# cree otra que tiene los mismos números pero ordenados
# de atrás para adelante. Deberá mostrar en pantalla
# ambas listas.


def retornarOrdenados(lista_de_numeros):
    copia_de_lista = lista_de_numeros[:]

    seguir = True
    while seguir:
        ordenados = True
        i = 0

        while i < len(copia_de_lista) - 1:
            if copia_de_lista[i] > copia_de_lista[i + 1]:
                copia_de_elemento = copia_de_lista[i]
                copia_de_lista[i] = copia_de_lista[i + 1]
                copia_de_lista[i + 1] = copia_de_elemento

                ordenados = False

            i += 1

        if ordenados:
            seguir = False

    print("Lista original:", lista_de_numeros)
    print("Lista ordenada:", copia_de_lista)


retornarOrdenados([4, 3, 78, 2, 0, 2])
retornarOrdenados([5, 4, 3, 2, 1])
