num1 = ""
num2 = ""
while num1 !=0 or num2 != 0:
    num1 = int(input("Introduce un numero: "))
    num2 = int(input("Introduce otro numero: "))
    while num1 > num2:
        num1 = int(input("Introduce un numero: "))
        num2 = int(input("Introduce otro numero: "))
    impares = []
    intervalo = input("Introduce A si el rango es abierto o C si el rango es cerrado: ").upper()
    while intervalo != "A" and intervalo != "C":
        intervalo = input("Introduce A si el rango es abierto o C si el rango es cerrado porfavor: ").upper()
    if intervalo == "C":
        for i in range (num1, num2 +1):
            if i % 2 != 0:
                impares.append(i)
        cadena_impares = ""
        for i in range(len(impares)):
            if i == len(impares) -1:
                cadena_impares += str(impares[i])
            else:
                cadena_impares += str(impares[i]) + ","
    else: 
        for i in range (num1 +1, num2):
            if i % 2 != 0:
                impares.append(i)
        cadena_impares = ""
        for i in range(len(impares)):
            if i == len(impares) -1:
                cadena_impares += str(impares[i])
            else:
                cadena_impares += str(impares[i]) + ","

    print(f"Impares que existen entre [{num1} - {num2}]: {cadena_impares}")
    print(f"En total existen {len(impares)} numeros impares en el rango")