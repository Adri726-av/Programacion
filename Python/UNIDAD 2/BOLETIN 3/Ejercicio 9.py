import random
def GeneraNumeros():
    numeros = []
    for i in range(0,100):
        num = random.randint(0,1000)
        numeros.append(num)
    return numeros

def Menu():
    print("A. Conocer el mayor")
    print("B. Conocer el menor")
    print("C. Obtener la suma de todos los números")
    print("D. Obtener la media")
    print("E. Sustituir el valor de un elemento por otro número introducido por teclado")
    print("F. Mostrar todos los números")
    opcion = input("Introduce un número: ").upper()
    return opcion

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

def Sustituir(lista):
    pos = int(input("Introduce la posición del número de quieres reemplazar: "))
    num = int(input("Introduce el número que quieres reemplazar: "))
    lista.pop(pos)
    lista.insert(pos,num)

opcion = Menu()
lista = GeneraNumeros()
mayor = conocerMayor(lista)
menor = conocerMenor(lista)
suma = Suma(lista)
media = Media(lista)
opcion = Menu()
if opcion == "A":
    print(mayor)
elif opcion == "B":
    print(menor)
elif opcion == "C":
    print(suma)
elif opcion == "D":
    print(media)
elif opcion == "E":
    sustituido = Sustituir(lista)
