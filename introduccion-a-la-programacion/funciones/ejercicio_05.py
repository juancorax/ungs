# Diseñar una función que, dada una lista de cadenas,
# devuelva una lista con todas las cadenas más largas, es
# decir, si dos o más cadenas miden lo mismo y son las
# más largas, la lista las contendrá a todas.
# Ejemplo: dada la lista [’Pepe’, ’Ana’, ’Juan’, ’Paz’], la
# función devolverá la lista de dos elementos [’Pepe’,
# ’Juan’].)


def devolverCadenaMasLarga(lista_de_cadenas):
    cadena_mas_larga = lista_de_cadenas[0]
    lista_de_cadenas_mas_largas = []

    for cadena in lista_de_cadenas:
        if len(cadena) > len(cadena_mas_larga):
            cadena_mas_larga = cadena
            lista_de_cadenas_mas_largas = []
            lista_de_cadenas_mas_largas.append(cadena_mas_larga)

        elif len(cadena) == len(cadena_mas_larga):
            lista_de_cadenas_mas_largas.append(cadena)

    return lista_de_cadenas_mas_largas


print(devolverCadenaMasLarga(["Julio", "Juan", "María", "Ana"]))
print(devolverCadenaMasLarga(["Gabi", "Juan", "Mati", "Victoria"]))
