def sumaFilaPares(matriz):
    suma=0
    for numfila in range (len(matriz)):
        if numfila % 2 == 0:
           for elementofila in matriz[numfila]:
               suma= suma + elementofila
    return suma

matriz=[[8,1,6],[3,5,7],[4,9,2]]
print(sumaFilaPares (matriz))