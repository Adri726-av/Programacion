def calculaMaxPorFila (matriz, numFila):
    max=0
    fila= matriz[numFila]
    for elemento in fila:
        if elemento > max:
            max=elemento
    return max  

def calculaListaColumna(columna, matriz):
    listaColumna = []
    for fila in range (len(matriz)):
        listaColumna.append(matriz[fila][columna])
    return listaColumna

def calculaMaxPorColumna(listaColumna):
    max = 0
    for i in listaColumna:
        if i > max:
            max = i
    return max
    
matriz = [[8,1,6,3],[3,5,7,2],[4,9,2,1]]
numFila=2
print(calculaMaxPorFila (matriz,numFila))
listaColumna = calculaListaColumna(2,matriz)
MaxColumna = calculaMaxPorColumna(listaColumna)
print(f"Maximo de columna: {MaxColumna}")