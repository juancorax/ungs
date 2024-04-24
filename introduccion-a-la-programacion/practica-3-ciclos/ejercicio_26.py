# Hacer una programa que, dada una palabra,
# la escriba recuadrada por asteriscos.
# Por ejemplo, si la palabra es "Ganaste",
# el programa debería escribir:

# ***********
# * Ganaste *
# ***********

palabra_del_usuario = input("Ingrese una palabra:\n")
largo_de_linea = len(palabra_del_usuario) + 4
linea_de_asteriscos = largo_de_linea * "*"

print(linea_de_asteriscos + "\n* " + palabra_del_usuario + " *\n" + linea_de_asteriscos)
