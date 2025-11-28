def Secuencia():
    notas = []
    num = int(input("Introduce un numero: "))
    while num > 0:
        notas.append(num)
        num = int(input("Introduce un numero: "))
    return notas
    
def esValida(notas):
    listaValida = []
    for i in notas:
        if i not in listaValida:
            listaValida.append(i)
            resultado = True
        else:
            resultado = False
    minimo = min(listaValida)
    maximo = max(listaValida)
    n = len(notas)
    for i in notas:
        if minimo == notas[0]:
            validoNotas = True
        elif maximo == notas[n]:
            validoNotas = True
        else:
            validoNotas = False
    return resultado, validoNotas, minimo, maximo

def calculaPuntos(notas):
    puntos = len(notas)
    return puntos

lista = Secuencia()
listaValida = esValida(lista)
puntos = calculaPuntos(lista)

if listaValida[0] == True:
    print(f"{puntos} puntos")

else: 
    print("La lista no es válida")
