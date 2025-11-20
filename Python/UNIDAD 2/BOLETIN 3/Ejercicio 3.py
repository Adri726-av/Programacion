def construyeLista():
    lista = []
    for i in range(0,9):
        num = int(input("Introduce un número: "))
        lista.append(num)
    return lista

def lista3(listaEntera):
    lista3 = []
    for i in listaEntera:
        if i % 10 == 3:
            lista3.append(i)
    print(lista3)
    return lista3

listaEntera = construyeLista()
lista3(listaEntera)