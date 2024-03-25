# Un profesor clasifica las notas
# de sus alumnos de la siguiente manera:
#
# 1-3 Reprobado
# 4-6 Debe rendir examen final
# 7-10 Eximido
#
# a) Escribir un programa que indique
#    la clasificación de una nota.
# b) Escribir un programa que pida 3 notas,
#    calcule el promedio e indique la
#    clasificación del mismo.

primeraNota = int(input("Ingrese la primera nota:\n"))
segundaNota = int(input("Ingrese la segunda nota:\n"))
terceraNota = int(input("Ingrese la tercera nota:\n"))

promedioDeNotas = (primeraNota + segundaNota + terceraNota) / 3

if promedioDeNotas >= 1 and promedioDeNotas <= 3:
    print("Reprobado")
else:
    if promedioDeNotas >= 4 and promedioDeNotas <= 6:
        print("Debe rendir examen final")
    else:
        print("Eximido")
