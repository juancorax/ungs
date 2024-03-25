# Un año es bisiesto si es múltiplo de 4.
# Pero no siempre, las excepciones son los años múltiplos
# de 100 que no son múltiplos de 400 (1900 no es bisiesto pero 2000, sí).
# Escribir en papel un programa que diga si un año ingresado
# por el usuario es bisiesto, realizar varias pruebas de
# escritorio, luego pasarlo a Python y verificar los resultados.

añoIngresado = int(input("Ingrese un año:\n"))

if (añoIngresado % 4 == 0 and añoIngresado % 100 == 0 and añoIngresado % 400 == 0) or (
    añoIngresado % 4 == 0 and añoIngresado % 100 != 0
):
    print("Es año bisiesto")
else:
    print("No es año bisiesto")
