import random
def getListaSinRepetidos(numColumna):
    lista = []
    i = 0
    while i <= 5:
        if numColumna == 0:
            num = random.randint(1,15)
            if num not in lista:
                lista.append(num)
                i += 1
        if numColumna == 1:
            num = random.randint(16,30)
            if num not in lista:
                lista.append(num)
                i += 1
        if numColumna == 2:
            num = random.randint(31,45)
            if num not in lista:
                lista.append(num)
                i += 1
        if numColumna == 3:
            num = random.randint(46,60)
            if num not in lista:
                lista.append(num)
                i += 1
        if numColumna == 4:
            num = random.randint(61,75)
            if num not in lista:
                lista.append(num)
                i += 1
    return lista

def generaCarton():
    cartonTemp = []
    for i in range(0,5):
        lista = getListaSinRepetidos(i)
        cartonTemp.append(lista)
    carton = []
    carton.append(cartonTemp[0][0])
    carton.append(cartonTemp[1][0])
    return carton
carton = generaCarton()
print(carton)

#Apartado 3
cartonGenerado = [
    [3,5,2,5,3],
    [5,4,3,2,1],
    [4,5,"--",3,2],
    [4,6,3,2,8],
    [3,5,4,3,6]
]
assert(len(cartonGenerado) == 5)
for i in range(0,5):
    assert(len(cartonGenerado[i]) == 5)
assert(cartonGenerado[2][2] == "--")
