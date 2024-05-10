# Definir una función que tome una lista de números s
# y un número decimal x y cambie todos los elementos
# menores que x por 0.
#
# Ej:
# Para
#
# s = [1, 4.1, 6.3, 2, 3.2, 8]
# x = 3
#
# el la lista debe pasar a ser:
# s = [0, 4.1, 6.3, 0, 3.2, 8]


def cambiarMenoresQueXPor0(s, x):
    for i in range(0, len(s)):
        if s[i] < x:
            s[i] = 0


a = [1, 4.1, 6.3, 2, 3.2, 8]
b = 3

cambiarMenoresQueXPor0(a, b)

print(a)
