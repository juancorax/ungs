# Escribir una función que se llame elevarAlCubo
# que tome un número y retorne el valor de ese
# número al cubo.


def elevar_al_cubo(numero):
    return numero**3


numero_del_usuario = int(input("Ingrese un numero:\n"))

print(elevar_al_cubo(numero_del_usuario))
