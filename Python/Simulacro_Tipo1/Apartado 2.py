contador = 0
num1 = int(input("Introduce un número: "))
contador += 1
num2 = int(input("Introduce otro numero: "))
contador += 1
num3 = int(input("Introduce otro número: "))
contador += 1

print(num1, num2, num3)

if num1 > num2 > num3:
    print("Decreciente")
elif num1 < num2 < num3:
    print("Creciente")
elif num1 == 0 or num2 == 0 or num3 == 0:
    print("Fin")
else:
    print("Desordenados")
print("Se han introducido ", contador, "números.")
media = (num1 + num2 + num3) // contador
print("La media de los",contador,"numeros es ",media)