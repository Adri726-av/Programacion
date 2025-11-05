num1 = int(input("Introduce un número: "))
num2 = int(input("Introduce otro numero: "))
num3 = int(input("Introduce otro número: "))
print(num1, num2, num3)
if num1 > num2 > num3:
    print("Decreciente")
elif num1 < num2 < num3:
    print("Creciente")
elif num1 == 0 and num2 == 0 and num3 == 0:
    print("Fin")
else:
    print("Desordenados")