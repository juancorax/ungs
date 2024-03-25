# Un ciudadano argentino está
# exento de votar en estos casos:
#
# * Tiene más de 70 años
# * Tiene entre 18 y 70 años pero se encuentra
#   a más de 500 km del centro de votación.
#
# Suponiendo que las variables edad y distancia
# representan la edad y la distancia del ciudadano,
# escribir la expresión lógica que representa esta situación.

edadSolicitada = int(input("Ingrese su edad:\n"))
distanciaSolicitada = float(
    input("Ingrese la distancia en Km. al centro de votación más cercano:\n")
)

if edadSolicitada >= 18 and edadSolicitada <= 70 and distanciaSolicitada <= 500:
    print("No está exento de votar")
else:
    print("Está exento de votar")
