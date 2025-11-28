def ListaColumnaPares(matriz):
    listaColumna = []
    for numFila in matriz:
        for fila in range(len(numFila)):
            if fila % 2 == 0:
                listaColumna.append(fila)
    return listaColumna

matriz=[[8,1,6],[3,5,7],[4,9,2]]
Lista = ListaColumnaPares(matriz)
print(f"Esta es la lista de columnas pares: {Lista}")