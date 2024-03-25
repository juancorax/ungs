# Se desea escribir un programa que pida al usuario
# tres números y luego muestre el mayor de ellos.
# Escribir el programa en papel, realizar 3 pruebas
# de escritorio y luego pasarlo a Python y verificar
# los resultados.

numero1 = int(input("Ingrese el primer número:\n"))
numero2 = int(input("Ingrese el segundo número:\n"))
numero3 = int(input("Ingrese el tercer número:\n"))

if (numero1 > numero2 and numero1 > numero3) or (
    numero1 == numero2 and numero1 > numero3
):
    print("El numero mayor es:", numero1)
else:
    if (numero2 > numero1 and numero2 > numero3) or (
        numero2 == numero1 and numero2 > numero3
    ):
        print("El numero mayor es:", numero2)
    else:
        print("El numero mayor es:", numero3)
