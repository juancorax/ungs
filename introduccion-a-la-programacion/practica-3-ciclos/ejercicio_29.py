# Escribir un programa que pida al usuario
# una cadena y una letra y reemplace las
# apariciones de dicha letra por asteriscos.
# Por ejemplo, si el usuario ingresa:
# "programador"
# "r"
# el programa debe devolver "p ∗ og ∗ amado∗"

cadena_del_usuario = input("Ingrese una cadena:\n")
letra_del_usuario = input("Ingrese una letra:\n")
resultado = ""

for letra in cadena_del_usuario:
    if letra == letra_del_usuario:
        resultado += "*"
    else:
        resultado += letra

print(resultado)
