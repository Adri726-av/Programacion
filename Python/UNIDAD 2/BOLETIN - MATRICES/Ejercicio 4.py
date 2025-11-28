matriz=[[8,1,6],[3,5,7],[4,9,2]]

def sumaFila(matriz, numFila):
    suma=0
    fila=matriz[numFila]
    for i in fila:
        suma += i
    return suma


n = int(input("Introduce un numero de fila"))
print(sumaFila (matriz,n))