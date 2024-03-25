# a) Escribir en papel un programa que pida
#    al usuario dos números, y que muestre en
#    pantalla al mayor de ambos.
#    Luego hacer 3 corridas de escritorio,
#    luego pasarlo a Python y por último correr
#    el programa con los valores iniciales de las corridas
#    y verificar que funciona como se esperaba.
#
# b) Ídem anterior pero para encontrar el menor.

numero1 = int(input("Ingrese un número:\n"))
numero2 = int(input("Ingrese otro número:\n"))

if numero1 > numero2:
    print("El mayor de ambos es:", numero1)
    print("El menor de ambos es:", numero2)
else:
    print("El mayor de ambos es:", numero2)
    print("El menor de ambos es:", numero1)
