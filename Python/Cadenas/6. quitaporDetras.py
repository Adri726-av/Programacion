num = input("Introduce un numero: ")
n = int(input("Introduce los dígitos que quieras elimiar por detras: "))
lista = list(num)
for i in range(0,len(lista)):
    if n > 0:
        lista.pop(-1)
    n = n - 1
numero = ""
for i in lista:
    numero = numero + i
print(numero)