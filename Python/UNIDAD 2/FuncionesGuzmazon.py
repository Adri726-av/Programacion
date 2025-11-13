# cargaCesta
def cargaCesta(dineroMax):
    productos = []
    precios = []
    costeTotal = 0

    return productos, precios, costeTotal

presupuesto = input("Dime cuanto tienes para gastarte como maximo")
resultados = cargaCesta(presupuesto)
productos = resultados[0]
precios = resultados[1]
costeTotal = resultados[2]
