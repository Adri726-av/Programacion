filas = 4
columnas = 5

def generamatriz(filas, columnas):
    matriz = []
    for i in range(filas):
        fila = []
        for columna in range(columnas):
            fila.append(i + columna)
        matriz.append(fila)

    return matriz

matrizGenerada = generamatriz(filas, columnas)
print(matrizGenerada)
