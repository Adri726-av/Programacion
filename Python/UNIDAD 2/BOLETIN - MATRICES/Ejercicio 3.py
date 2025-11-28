matriz = [[8,1,6], [3, 5, 7], [4, 9, 2]]

def listaPares():
    lista = []
    l = int(len(matriz))
    for fila in range(0,l):
        for i in matriz[fila]:
            
    return lista
pares = listaPares()
print(pares)

# Otra forma, la de la maestra

#def paresLista():
#    pares = []
#    #TO DO
#    return pares

#def paresMatriz(matriz):
#    pares = []
#    for i in range(0, len(matriz)):
#        fila = matriz[i]
#        paresFila = paresLista(fila)
#        pares = pares + paresFila
#    return pares