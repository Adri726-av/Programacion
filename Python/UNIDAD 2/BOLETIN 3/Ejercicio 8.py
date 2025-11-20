def pideNumeros():
    n = int(input("Introduce un numero: "))
    numeros = []
    for i in range (0,n):
        numero = int(input("Introduce numeros: "))
        numeros.append(numero)
    return numeros

def Menu():
    print("a. Devuelve la media")
    print("b. Devuelve cuantos son pares")
    print("c. Devuelve cuántos son negativos")
    print("d. Devuelve la suma de todos los numeros introducidos")
    opcion = input("Introduce una opcion: ")
    return opcion

def Media(lista):
    suma = 0
    for i in range(len(lista)):
        suma += lista[i]
    media = suma / len(lista)
    return media

def Pares(lista):
    contador = 0
    for i in lista:
        if i % 2 == 0:
            contador += 1
    return contador

def Negativos(lista):
    contador = 0
    for i in lista:
        if i<0:
            contador += 1
    return contador   

def Suma(lista):
    suma = 0 
    for i in lista:
        suma += i
    return suma

lista = pideNumeros()
print(lista)
opcion = Menu()
media = Media(lista)
pares = Pares(lista)
negativos = Negativos(lista)
suma = Suma(lista)
if opcion == "a":
    print(f"La media de todos los numeros es: {media}")
if opcion == "b":
    print(f"Son {pares} numeros pares")
if opcion == "c":
    print(f"Son {negativos} numeros negativos")
if opcion == "d":
    print(f"La suma de todos los numeros introducidos son : {suma}")