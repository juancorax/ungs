# Hacer un programa que genere una clave
# provisoria para la gestión online de
# clientes de una empresa.
# El programa le pedirá el apellido y
# generará una clave de 5 caracteres,
# tomará las primeras 4 consonantes
# de la palabra ingresada.
# Cuando las consonantes no alcancen a 4,
# las faltantes las reemplazará por "*".
# Ejemplos:
# clemente CLMN
# rivera RVR*
# oreo R***
# La clave se completará con 1 dígito
# generado aleatoriamente entre 0 y 9.
# Ejemplos: CLMN1 RVR*4 R***7

import random

apellido_del_cliente = input("Ingrese su apellido:\n").lower()
CLAVE = ""
CANTIDAD_DE_CONSONANTES = 0

for letra in apellido_del_cliente:
    if (len(CLAVE) < 4) and (
        letra != "a" and letra != "e" and letra != "i" and letra != "o" and letra != "u"
    ):
        CLAVE += letra
        CANTIDAD_DE_CONSONANTES += 1

CLAVE = CLAVE.upper()

if CANTIDAD_DE_CONSONANTES < 4:
    CLAVE += (4 - len(CLAVE)) * "*"

CLAVE += str(random.randint(0, 9))

print(CLAVE)
