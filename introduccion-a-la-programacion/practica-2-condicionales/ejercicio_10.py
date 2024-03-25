# Hacer en pseudocodigo y luego un programa
# que calcule el importe que se le facturará a un
# cliente por consumo de electricidad sabiendo
# que la compañía que se la provee cobra una tarifa
# fija de 480 pesos que incluye los primeros 200 KW
# consumidos y los KW excedentes se los cobra
# a 25,5 pesos el KW, además se agregan $78 de impuestos.
# Se leen los valores del medidor al comienzo
# y al fin del período.

kwInicial = float(
    input("Ingrese el consumo eléctrico expresado en KW al comienzo del período:\n")
)
kwFinal = float(
    input("Ingrese el consumo eléctrico expresado en KW al final del período:\n")
)

CONSUMO_ELECTRICO = kwFinal - kwInicial

TARIFA_FIJA = 480
KW_EN_TARIFA_FIJA = 200
VALOR_DE_CADA_KW_EXCEDENTE = 25.5
IMPUESTOS = 78

if CONSUMO_ELECTRICO <= KW_EN_TARIFA_FIJA:
    IMPORTE_DE_FACTURACION = TARIFA_FIJA + IMPUESTOS
else:
    IMPORTE_DE_FACTURACION = (
        TARIFA_FIJA
        + IMPUESTOS
        + (CONSUMO_ELECTRICO - KW_EN_TARIFA_FIJA) * VALOR_DE_CADA_KW_EXCEDENTE
    )

print("El importe de facturación es de: $", IMPORTE_DE_FACTURACION)
