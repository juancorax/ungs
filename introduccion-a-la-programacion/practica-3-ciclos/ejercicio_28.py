# Escribir un programa que pida
# al usuario una cadena e indique
# si esta posee un diptongo
# (dos vocales unidas).

cadena_del_usuario = input("Ingrese una cadena:\n")
TIPO_DE_LETRA_ANTERIOR = ""
DIPTONGO = False

for letra in cadena_del_usuario:
    TIPO_DE_LETRA = ""

    if letra == "a" or letra == "e" or letra == "i" or letra == "o" or letra == "u":
        TIPO_DE_LETRA = "vocal"
    else:
        TIPO_DE_LETRA = "consonante"

    if (TIPO_DE_LETRA_ANTERIOR == "vocal") and (TIPO_DE_LETRA == "vocal"):
        DIPTONGO = True
        break

    TIPO_DE_LETRA_ANTERIOR = TIPO_DE_LETRA

if DIPTONGO:
    print('"' + cadena_del_usuario + '" posee un diptongo')
else:
    print('"' + cadena_del_usuario + '" no posee un diptongo')
