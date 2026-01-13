import random
carton_bingo = [
    [5,  21, 38, 50, 63],
    [12, 17, 44, 47, 74],
    [1,  29, "--", 55, 69],
    [9,  25, 32, 59, 61],
    [14, 19, 41, 52, 66]
]

def generaAleatorio(listaBolas):
    num = random.randint(1,75)
    if num not in listaBolas:
        listaBolas.append(num)
    return num , listaBolas

def buscaNumeroEnLista(lista, numero):
    i = 0
    encontrado = False
    posicion = -1
    while i < len(lista) and not encontrado:
        if lista[i] == numero:
            encontrado = True
            posicion = i
        else:
            i += 1
    return posicion

def compruebaSiHayLineaEnFila(carton, listaBolas, numFila):
    fila_comprobar = carton[numFila]
    hayLinea = True
    for i in fila_comprobar:
        posicion = buscaNumeroEnLista(listaBolas, i)
        if posicion == -1:
            hayLinea = False
    return hayLinea

def jugarALaLinea(carton, listaBolas):
    fila = -1
    while hayLinea != True:
        resultado  = generaAleatorio(listaBolas)
        lista = resultado[1]
        fila = -1
        i = 0
        encontrado = False
        while i < len(lista)-1 and not encontrado:
            comprobacion = compruebaSiHayLineaEnFila(carton, lista, i)
            if comprobacion == True:
                fila = i
            else:
                i += 1
    return fila , listaBolas

listaBolas = []

hayLinea = compruebaSiHayLineaEnFila(carton_bingo, listaBolas, 0)


resultado = jugarALaLinea(carton_bingo, listaBolas)
numFila = resultado[0]
lista = resultado[1]
