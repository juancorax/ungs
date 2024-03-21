# La empresa que administra los cajeros automáticos
# lo contrata para que programen la entrega de billetes,
# el usuario ingresa la cantidad de dinero que desea
# y usted debe indicar cuantos billetes de cada denominación
# se debe entregar. Es importante entregar siempre la menor
# cantidad de billetes.
#
# Ayuda: El operador % da el resto de la división a/b,
# y el operador // da la parte entera del cociente de a/b.

cantidadDeDineroDeseada = int(input("Ingrese la cantidad de dinero deseada\n"))

cantidadBilletes2000 = cantidadDeDineroDeseada // 2000
restoDeDinero = cantidadDeDineroDeseada % 2000

cantidadBilletes1000 = restoDeDinero // 1000
restoDeDinero = restoDeDinero % 1000

cantidadBilletes500 = restoDeDinero // 500
restoDeDinero = restoDeDinero % 500

cantidadBilletes200 = restoDeDinero // 200
restoDeDinero = restoDeDinero % 200

cantidadBilletes100 = restoDeDinero // 100

print("La cantidad de billetes de $2000 es de " + str(cantidadBilletes2000))
print("La cantidad de billetes de $1000 es de " + str(cantidadBilletes1000))
print("La cantidad de billetes de $500 es de " + str(cantidadBilletes500))
print("La cantidad de billetes de $200 es de " + str(cantidadBilletes200))
print("La cantidad de billetes de $100 es de " + str(cantidadBilletes100))
