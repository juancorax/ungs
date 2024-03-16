# Escribir un programa en Python que pida al usuario
# una cantidad de segundos y muestre en pantalla
# la cantidad de días, minutos y segundos que representa.
# Por ejemplo, si el usuario ingresa 86461 segundos
# el programa debe mostrar por pantalla:
# 1 día 0 horas 1 minuto 1 segundo.

cantidadDeSegundos = int(input("Ingrese un lapso de tiempo expresado en segundos:\n"))

diasQueRepresenta = cantidadDeSegundos // 86400
horasQueRepresenta = (cantidadDeSegundos % 86400) // 3600
minutosQueRepresenta = (cantidadDeSegundos % 3600) // 60
segundosQueRepresenta = cantidadDeSegundos % 60

print(
    str(diasQueRepresenta)
    + " día/s "
    + str(horasQueRepresenta)
    + " hora/s "
    + str(minutosQueRepresenta)
    + " minuto/s "
    + str(segundosQueRepresenta)
    + " segundo/s"
)
