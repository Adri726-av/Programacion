matriz = [[0,2,4],[1,3,5],[6,8,10]]
print(matriz) # Imprime la matriz entera, osea, las 3 listas
print(matriz[1]) # Imprime la lista 1 de la matriz
print(matriz[1][1]) # elemento lista 1, columna 1

def sumaFila0(matriz, numFila):
    suma = 0
    for i in matriz[numFila]:
        suma += i
    return suma

def sumaFila1(matriz, numFila):
    suma = 0
    for i in matriz[numFila]:
        suma += i
    return suma

def sumaFila2(matriz, numFila):
    suma = 0
    for i in matriz[numFila]:
        suma += i
    return suma

def encontrar(numero, matriz):
    encontrado = False
    pos = 0
    while pos < len(matriz) and not encontrado:
        if matriz[pos][pos] == numero:
            encontrado = True
        else:
            pos += 1

suma0 = sumaFila0(matriz, 0)
suma1 = sumaFila1(matriz,1)
suma2 = sumaFila2(matriz, 2)
encontrado = encontrar(3, matriz)
print(encontrado)

total = suma0 + suma1 + suma2
print(total)

