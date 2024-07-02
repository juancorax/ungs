# Hacer un programa que calcule el importe que se le facturará
# a un cliente por consumo de electricidad sabiendo que la compañía
# que la provee cobra una tarifa fija de $200 que incluye
# los primeros 200 KW consumidos y los KW excedentes se los cobra
# a $1.5 el KW, además se agregan $7,8 de impuestos.
# Se leen los valores del medidor al comienzo y al fin del período

tarifaFijaHasta200Kw = 200
precioPorKWExcedente = 1.5
impuestos = 7.8

kwInicial = int(input("Ingrese el valor del medidor al comienzo del periodo: "))
kwFinal = int(input("Ingrese el valor del medidor al final del periodo: "))
consumoElectrico = kwFinal - kwInicial

if consumoElectrico <= 200:
    importe = tarifaFijaHasta200Kw + impuestos
else:
    importe = (
        tarifaFijaHasta200Kw
        + ((consumoElectrico - 200) * precioPorKWExcedente)
        + impuestos
    )

print("El importe es de: $", importe)
