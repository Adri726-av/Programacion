def sumaColumna(matriz, numColum):
    suma=0
    columna = calculaListaColumna(numColum,matriz)
    for i in columna:
        suma += i
    return suma

def calculaListaColumna(columna, matriz):
    listaColumna = []
    for fila in range (len(matriz)):
        listaColumna.append(matriz[fila][columna])
    return listaColumna

matriz=[[8,1,6],[3,5,7],[2,9,2]]
print(sumaColumna (matriz,4))