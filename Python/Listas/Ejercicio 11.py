import random
lista = []
pares = []
impares = []
for i in range (20):
    numero = random.randint(0,100)
    if numero % 2 == 0:
        pares.append(numero)
    else :
        impares.append(numero)
lista = pares + impares
print(lista)