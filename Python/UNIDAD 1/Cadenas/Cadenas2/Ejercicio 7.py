nombre = input("Introduce tu nombre: ")
lista = nombre.split()
#print(lista)
palabraSalida = ""
for nom in lista:
    palabraSalida = palabraSalida + nom[0].upper() + nom [1:] + " "
print(palabraSalida)