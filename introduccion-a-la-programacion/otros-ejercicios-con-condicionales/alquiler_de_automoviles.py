# Una compañía de alquiler de autos desea un programa
# para emitirlas las facturas de sus clientes,
# teniendo presente los siguientes puntos:
#
# a. La empresa cobra una tarifa fija de $200 cuando el auto
# es utilizado hasta 300km.
#
# b. Para distancias mayores a 300km, hay que considerar que:
#
# i. si la distancia es menor o igual a 1000 km,
# la tarifa es de $200 más $0,5 por
# cada km extra.
#
# ii. si la distancia es mayor a 1000 km,
# la tarifa es de $200 más $0,5 por cada km
# entre los 300 y 1000 más $0,3 por cada km
# que supere los 1000km.

distanciaRecorrida = int(input("Ingrese la distancia recorrida en kilometros: "))

tarifaFijaHasta300Km = 200

if distanciaRecorrida <= 300:
    montoDeTarifa = tarifaFijaHasta300Km
elif distanciaRecorrida > 300 and distanciaRecorrida <= 1000:
    montoDeTarifa = 200 + ((distanciaRecorrida - 300) * 0.5)
else:
    montoDeTarifa = 200 + ((1000 - 300) * 0.5) + ((distanciaRecorrida - 1000) * 0.3)

print("El monto de la tarifa es de: $", montoDeTarifa)
