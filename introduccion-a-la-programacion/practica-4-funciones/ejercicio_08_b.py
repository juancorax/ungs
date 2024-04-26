# Escribir una función que tome un parámetro
# de tipo entero y devuelva el valor True
# si se la llama con un número primo y
# False en caso contrario.


def es_primo(numero):
    if numero <= 1:
        return False

    for i in range(2, numero):
        if numero % i == 0:
            return False

    return True


numero_del_usuario = int(input("Ingrese un numero entero:\n"))

if es_primo(numero_del_usuario):
    print("El numero es primo")
else:
    print("El numero no es primo")
