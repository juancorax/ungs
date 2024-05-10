# Hacer un programa que guarde la siguiente lista en una variable:
# ["elefante", "jirafa", "mono"] luego pida el nombre de otro animal,
# lo agregue a la lista e imprima en pantalla el cuarto animal de la lista.

animales = ["elefante", "jirafa", "mono"]

animal_del_usuario = input("Ingrese el nombre de un animal: ")

animales.append(animal_del_usuario)

print(animales[len(animales) - 1])
