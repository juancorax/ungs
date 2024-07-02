# Diseñar una función llamada menu_generico que reciba
# una lista con opciones. Cada opción se asociará a un
# número entre 1 y la longitud de la lista y la función
# mostrará por pantalla el menú con el número asociado a
# cada opción.
#
# El usuario deberá introducir por teclado una opción. Si la
# opción es válida, se devolverá su valor, y si no, se le
# advertirá del error y se solicitará nuevamente la
# introducción de un valor.


def menu_generico(lista):
    seguir = True
    while seguir:
        print("Seleccione un opcion del menu:")

        i = 1
        for opcion in lista:
            print(i, opcion)

            i += 1

        opcion_introducida = int(input("Opcion: "))

        j = 1
        for opcion in lista:
            if j == opcion_introducida:
                print("Usted eligio:", opcion)
                seguir = False

            j += 1

        if seguir:
            print("Por favor, introduzca una opcion valida.")


menu_generico(["pizza", "fideos", "sopa", "lasagna", "hamburguesa"])
