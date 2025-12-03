matriz = [[0,2,4],
          [1,3,5],
          [6,8,10]
          ]

def encontrar(numero, matriz):
    encontrado = False
    pos = 0
    while pos < len(matriz) and not encontrado:
        if matriz[pos][pos] == numero:
            encontrado = True
        else:
            pos += 1

encontrado = encontrar(3, matriz)
print(encontrado)