# Dadas tres notas parciales. Indicar si se promociona,
# va a final o recursa. Sabiendo que:
# [0,4) - Recursa
# [4,7) - Final
# [7-10] - Promociona

notaParcial1 = int(input("Ingrese la nota del primer parcial:\n"))
notaParcial2 = int(input("Ingrese la nota del segundo parcial:\n"))
notaParcial3 = int(input("Ingrese la nota del tercer parcial:\n"))

promedioDeParciales = (notaParcial1 + notaParcial2 + notaParcial3) / 3

if promedioDeParciales >= 0 and promedioDeParciales < 4:
    print("Recursa")
else:
    if promedioDeParciales >= 4 and promedioDeParciales < 7:
        print("Final")
    else:
        print("Promociona")
