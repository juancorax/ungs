# Introducir dos números enteros por el teclado, DIVIDENDO
# y DIVISOR. Si dividendo es divisible por divisor, el
# programa debe mostrar el mensaje “DIVISIBLES” caso
# contrario “NO SON DIVISIBLES”.

dividendo = int(input("Ingrese un dividendo:\n"))
divisor = int(input("Ingrese un divisor:\n"))

if dividendo % divisor == 0:
    print("DIVISIBLES")
else:
    print("NO SON DIVISIBLES")
