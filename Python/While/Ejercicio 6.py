num1 = int(input("Introduce un numero: "))
num2 = int(input("Introduce un numero: "))
suma = 0
while not (num1 == 0 and num2 == 0):
    suma = num1 + num2
    print(suma)
    num1 = int(input("Introduce un numero: "))
    num2 = int(input("Introduce otro numero: "))
print ("Fin")