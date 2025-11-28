matriz = [[8,1,6], [3,5,7], [4,9,2]]

def devuelveDiagonalPrincipal(matriz):
    diagonal = []
    for i in range(len(matriz)):
        diagonal.append(matriz[i][i])
    return diagonal 

def devuelveDiagonalInversa(matriz):
    diagonal = []
    columna = len(matriz) -1
    for fila in range(len(matriz)):
        diagonal.append(matriz[fila][columna])
        columna -= 1
    return diagonal

def esCuadrada(matriz):
    fila=len(matriz)
    columna = len(matriz[0])
    if fila == columna:
        return True
    else:
        return False

DiagonalPrincipal = devuelveDiagonalPrincipal(matriz)
DiagonalInversa = devuelveDiagonalInversa(matriz)
resultado = esCuadrada(matriz)
if resultado == True:
    print(DiagonalPrincipal)
    print(DiagonalInversa)
else:
    listaVacia = []
    print(listaVacia)
    print(listaVacia)