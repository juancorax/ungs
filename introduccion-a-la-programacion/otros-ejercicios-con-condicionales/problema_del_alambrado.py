tendido = 7000
costoRollo = 640
metrosPorRollo = 80

dineroDisponible = float(input("Indique el dinero que dispone: $ "))
largoCampo = float(input("Indique el largo del campo: "))
anchoCampo = float(input("Indique el ancho del campo: "))
tarjeta = input("Escriba si o no si pagará con tarjeta de crédito: ")

perimetroDelCampo = (largoCampo + anchoCampo) * 2

if perimetroDelCampo % metrosPorRollo == 0:
    cantidadDeRollos = perimetroDelCampo / metrosPorRollo
else:
    cantidadDeRollos = int((perimetroDelCampo // metrosPorRollo) + 1)

costoDeRollos = cantidadDeRollos * costoRollo
costoDeRollosConTarjeta = costoDeRollos + ((costoDeRollos * 8) / 100)
importeFinal = costoDeRollos + tendido
importeFinalConTarjeta = importeFinal + ((importeFinal * 8) / 100)

if dineroDisponible >= importeFinal:
    print("El dinero disponible alcanza para contratar el servicio de alambrado.")
    if tarjeta.lower() == "si":
        print("El importe final es de: $", importeFinalConTarjeta)
    else:
        print("El importe final es de: $", importeFinal)
    print("Se utilizaran", cantidadDeRollos, "rollos de alambre.")
elif dineroDisponible >= costoDeRollos:
    print("No alcanza para el servicio de tendido, pero puede hacerlo personalmente.")
    if tarjeta.lower() == "si":
        print("El importe final es de: $", costoDeRollosConTarjeta)
    else:
        print("El importe final es de: $", costoDeRollos)
    print("Se utilizaran", cantidadDeRollos, "rollos de alambre.")
else:
    print("El presupuesto es menor al costo del alambre.")
    if tarjeta.lower() == "si":
        print("Solo podría comprar con tarjeta.")
        print("El importe final es de: $", costoDeRollosConTarjeta)
        print("Se utilizaran", cantidadDeRollos, "rollos de alambre.")
    else:
        print("No le alcanza el presupuesto.")
