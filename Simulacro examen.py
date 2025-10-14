nombre = input("¿Cuál es tu nombre?: ")

while nombre != "exit":
    nota =int(input("Cual es tu nota: "))

    while nota <0 or nota >100:
        nota = int(input("Nota no valida: "))

    if nota <=49:
        print("Suspenso")
    elif nota <=59:
        print("Suficiente")
    elif nota <=69:
        print("Bien")
    elif nota <=89:
        print("Notable")
    else:
        print("Sobresaliente")
    nombre = input("Cual es tu nombre: ")