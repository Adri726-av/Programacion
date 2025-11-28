matriz = [[8,1,6], [3,5,7], [4,9,2]]

def sumaFila(matriz, numFila):
    suma=0
    fila=matriz[numFila]
    for i in fila:
        suma += i
    return suma

def calculaListaColumna(columna, matriz):
    listaColumna = []
    for fila in range (len(matriz)):
        listaColumna.append(matriz[fila][columna])
    return listaColumna

def sumaColumna(matriz, numColum):
    suma=0
    columna = calculaListaColumna(numColum,matriz)
    for i in columna:
        suma += i
    return suma

def sumaPorFilasIgual(suma0, suma1, suma2):
    if suma0 == suma1 and suma1 == suma2:
        return True
    else: 
        return False
    
def sumaPorColumnasIgual(suma0, suma1, suma2):
    if suma0 == suma1 and suma1 == suma2:
        return True
    else: 
        return False

sumaFila0 = sumaFila(matriz, 0)
sumaFila1 = sumaFila(matriz, 1)
sumaFila2 = sumaFila(matriz, 2)

sumaColumna0 = sumaColumna(matriz, 0)
sumaColumna1 = sumaColumna(matriz, 1)
sumaColumna2 = sumaColumna(matriz, 2)

filas = sumaPorFilasIgual(sumaFila0, sumaFila1, sumaFila2)
columnas = sumaPorColumnasIgual(sumaColumna0, sumaColumna1, sumaColumna2)

if filas:
    print("La suma total de las filas es lo mismo")
else:
    print("La suma total de las filas NO es lo mismo")

if columnas:
    print("La suma total de las columnas es lo mismo")
else:
    print("La suma total de las columnas NO es lo mismo")

if filas and columnas:
    print("La suma total de las filas y de las columnas es lo mismo")
else:
    print("La suma total de las filas y las columnas NO es lo mismo")