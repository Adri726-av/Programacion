dia = int(input("Dime un día: "))
mes = int(input("Dime un mes: "))
año = int(input("Dime un año: "))

contador_dias = 0
if año % 4 == 0 or año % 400 == 0:
    for contador_mes in range (1, mes):
        if contador_mes == 1 or contador_mes == 3 or contador_mes == 5 or contador_mes == 7 or contador_mes == 8 or contador_mes == 10 or contador_mes == 12:
            contador_dias += 31
        elif contador_mes == 4 or contador_mes == 6 or contador_mes == 9 or contador_mes == 11:
            contador_dias += 30
        else:
            contador_dias += 29
if not (año % 4 == 0 or año % 400 == 0):
    for contador_mes in range (1, mes):
        if contador_mes == 1 or contador_mes == 3 or contador_mes == 5 or contador_mes == 7 or contador_mes == 8 or contador_mes == 10 or contador_mes == 12:
            contador_dias += 31
        elif contador_mes == 4 or contador_mes == 6 or contador_mes == 9 or contador_mes == 11:
            contador_dias += 30
        else:
            contador_dias += 28
contador_dias += dia
print("Han pasado ", contador_dias, "dias desde el 1 de enero de el año", año)