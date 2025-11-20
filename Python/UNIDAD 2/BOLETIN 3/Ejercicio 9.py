import random
def GeneraNumeros():
    numeros = []
    for i in range(0,100):
        num = random.randint(0,1000)
        numeros.append(num)
    return numeros

def conocerMayor(lista):
    max = 0
    for i in lista:
        if i > max:
            max = i
    return max

def conocerMenor(lista):
    min = 999
    for i in lista:
        if i < min:
            min = i
    return min

def Suma(lista):
    suma = 0
    for i in lista:
        suma += i
    return suma

def Media(lista):
    suma = 0
    for i in range(len(lista)):
        suma += lista[i]
    media = suma / len(lista)
    return media   

lista = GeneraNumeros()
mayor = conocerMayor(lista)
menor = conocerMenor(lista)
suma = Suma(lista)
media = Media(lista)
print(lista)
print(mayor)
print(menor)
print(suma)
print(media)