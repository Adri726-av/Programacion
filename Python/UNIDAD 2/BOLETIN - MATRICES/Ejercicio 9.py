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

DiagonalPrincipal = devuelveDiagonalPrincipal(matriz)
DiagonalInversa = devuelveDiagonalInversa(matriz)

print(DiagonalPrincipal)
print(DiagonalInversa)