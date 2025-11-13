#Definicion funcion CompruebaSiesPar, recibe un numero y devuelve un booleano (True o False)
def compruebaPar (numero): 
    return numero % 2 == 0

num = int(input("Dame un numero: "))
esPar = compruebaPar(num)
print(esPar)