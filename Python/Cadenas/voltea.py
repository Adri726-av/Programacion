numero = input("Dime un número: ")
listareversa = []
for i in range (len(numero)-1, -1, -1):
    listareversa.append(numero[i])
print(listareversa)