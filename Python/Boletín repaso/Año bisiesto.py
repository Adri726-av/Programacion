año = int(input("Introduce un año: "))
while año >=0:
    if año % 4 == 0:
        print("El año ", año, "es bisiesto")
    elif año % 400 == 0:
        print("El año", año, "es bisiesto")
    else:
        print("El año", año, "no es bisiesto")
    año = int(input("Introduce un año: "))