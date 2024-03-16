# Determinar cuántos segundos tiene una hora,
# y cuántos tiene un día.

HORAS_POR_DIA = 24
MINUTOS_POR_HORA = 60
SEGUNDOS_POR_MINUTO = 60

SEGUNDOS_POR_HORA = MINUTOS_POR_HORA * SEGUNDOS_POR_MINUTO
SEGUNDOS_POR_DIA = HORAS_POR_DIA * MINUTOS_POR_HORA * SEGUNDOS_POR_MINUTO

print("Una hora tiene " + str(SEGUNDOS_POR_HORA) + " segundos")
print("Un dia tiene " + str(SEGUNDOS_POR_DIA) + " segundos")

# Escribir una expresión matemática que transforme
# un lapso de tiempo expresado en segundos a uno
# expresado en minutos.

lapsoEnSegundos = int(input("Ingrese un lapso de tiempo expresado en segundos\n"))

lapsoEnMinutos = lapsoEnSegundos // 60

print("El lapso de tiempo en minutos es de " + str(lapsoEnMinutos))

# Escribir otra para transformar a horas
# y una última que transforme a días.

lapsoEnHoras = lapsoEnSegundos // 3600
lapsoEnDias = lapsoEnSegundos // 86400

print("El lapso de tiempo en horas es de " + str(lapsoEnHoras))
print("El lapso de tiempo en dias es de " + str(lapsoEnDias))
