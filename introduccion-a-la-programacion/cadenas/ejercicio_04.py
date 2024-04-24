# Hacer un programa que dados un caracter
# y una cadena muestre la misma cadena
# con un * en lugar de dicho carácter.

cadena = input("Ingrese una cadena:\n")
caracter_del_usuario = input("Ingrese el caracter a modificar:\n")
resultado = ""

for caracter in cadena:
    if caracter == caracter_del_usuario:
        resultado += "*"
    else:
        resultado += caracter

print(resultado)
