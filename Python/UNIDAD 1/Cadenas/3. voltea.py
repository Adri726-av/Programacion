numero = input("Dime un número: ")
listareversa = []
for i in range (len(numero)-1, -1, -1):
    listareversa.append(numero[i])
listainversa = ""
for valor in listareversa:
    listainversa = listainversa + valor
print(listainversa)