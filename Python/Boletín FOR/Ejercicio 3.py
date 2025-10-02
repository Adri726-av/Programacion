num = int(input("Introduce un numero mayor que 0:"" "))
if num < 0:
    print("Programa finalizado, el número debe ser mayor que 0")
else:
    for i in range(1,num):
        print(i)