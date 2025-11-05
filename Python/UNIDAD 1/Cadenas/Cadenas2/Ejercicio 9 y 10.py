cadena = input("Introduce una cadena: ")
caracter1 = input("Introduce una letra: ")

while not(len(caracter1)== 1):
    caracter1 = input("Un solo carácter porfavor: ")
    
caracter2 = input("Introduce otra letra: ")

while not (len(caracter2)== 1):
    caracter2 = input("Un solo carácter: ")

if caracter1 in cadena:
    salida = cadena.replace(caracter1, caracter2)
print(salida)