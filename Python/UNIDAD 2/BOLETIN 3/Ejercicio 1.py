def obtengoLista():
    lista = []
    num = int(input("Cuántos números desea introducir"))
    for i in range(0,num):
        enteros = int(input("Introduce un número entero"))
        lista.append(enteros)

    return lista

def calculaListaInversa(lista):
    invertida = []
    for i in range(len(lista)-1, -1, -1):
        invertida.append(lista[i])
    print(invertida)
    return invertida

listaInicial = obtengoLista()
listaInversa = calculaListaInversa(listaInicial)