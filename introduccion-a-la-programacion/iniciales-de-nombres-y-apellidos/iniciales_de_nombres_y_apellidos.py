# Ingresa nombres y apellidos y devuelve iniciales

nombre = input("Ingrese su nombre completo: ").upper()

iniciales = ""

i = 0
for letra in nombre:
    if i == 0:
        iniciales += letra
        i += 1

    elif letra == " ":
        i = 0

print(iniciales)
