matriz = [[22, 20, 19, 21],
          [18, 25, 23, 22],
          [19, 21, 20, 24],
          [17, 23, 22, 19],
          [24, 23, 27, 26]]

def calcula(listaNumeros):
    media = 0

    for i in range(len(listaNumeros)):
        media = listaNumeros[i] + media

    media = media / len(listaNumeros)

    return media

def calculaMediaLista(listaMatriz):
    listaMedias = []
    for fila in range(0,len(listaMatriz)):
        resultado = calcula(matriz[fila])
        listaMedias.append(resultado)

    return listaMedias

def calculaMediaHotel(lista):
    mediaHotel = calcula(lista)

    return mediaHotel

def calculaListaColumna(columna, matriz):
    listaColumna = []
    for fila in range (len(matriz)):
        listaColumna.append(matriz[fila][columna])
    return listaColumna

def calculaMediaColumnaDeterminada(numcolumna,matriz):
    lista = calculaListaColumna(numcolumna, matriz)
    media = calcula(lista)
    return media

def calculaMediaNumHabitacion():
    

listaNumeros = [22, 20, 19, 21]
columna = 0

resultado = calcula(listaNumeros)
print(resultado)
media = calculaMediaLista(matriz)
print(f"La temperatura media de las plantas es {media}")
hotel = calculaMediaHotel(media)
print(f"La temperatura media de todo el hotel es de {hotel}º")
columna0 = calculaListaColumna(columna, matriz)
print(f"la columna 0: {columna0}")
pidoColumna = int(input("Dime un numero: "))
mediaColumna = calculaMediaColumnaDeterminada(pidoColumna, matriz)
print(f"La media de la columna {pidoColumna} es : {mediaColumna}")