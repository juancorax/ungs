# c) Hacer un programa que permita al usuario
#    elegir un número n y un número c,
#    y luego muestre los c números naturales
#    que le siguen a n
#    (n + 1, n + 2, · · · , n + c).

n = int(input("Ingrese un número 'n':\n"))
c = int(input("Ingrese un número 'c':\n"))

i = n + 1
while i <= n + c:
    print(i)
    i += 1
