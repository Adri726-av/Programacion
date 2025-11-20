def estaOrdenadaAscendentemente(lista):
    ordenada = True
    i = 0
    n = len(lista)
    while i < n and ordenada:
        if lista[i] > lista[i + 1]:
            ordenada = False
        i = i+1
    return ordenada
lista =[1,2,3,4]
orden = estaOrdenadaAscendentemente(lista)
lista = [1,8,3,4]
orden = estaOrdenadaAscendentemente(lista)