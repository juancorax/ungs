# Diseñar una función que, dada una lista de cadenas,
# devuelva la cadena más larga. Si dos o más cadenas
# miden lo mismo y son las más largas, la función
# devolverá una cualquiera de ellas.
# Ejemplo: dada la lista [’Pepe’, ’Juan’, ’María’, ’Ana’], la
# función devolverá la cadena ’María’.


def devolverCadenaMasLarga(lista_de_cadenas):
    cadena_mas_larga = lista_de_cadenas[0]

    for cadena in lista_de_cadenas:
        if len(cadena) > len(cadena_mas_larga):
            cadena_mas_larga = cadena

    return cadena_mas_larga


print(devolverCadenaMasLarga(["Pepe", "Juan", "María", "Ana"]))
print(devolverCadenaMasLarga(["Gabi", "Juan", "Mati", "Victoria"]))
