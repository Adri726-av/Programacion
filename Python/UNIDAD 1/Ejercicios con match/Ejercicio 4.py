mes = int(input("Introduce un número del mes:" ""))
dia = int(input("Introduce un día del mes:" ""))
match mes:
    case 1|2|3:
        if mes == 1:
            print("Invierno")
        elif mes == 2:
            print("Invierno")
        elif mes == 3 and dia <=20:
            print("Invierno")
        else: print("Primavera")
    case 4|5|6:
        if mes == 4:
            print("Primavera")
        elif mes == 5:
            print("Primavera")
        elif mes == 6 and dia <=20:
            print("Primavera")
        else: print("Verano")
    case 7|8|9:
        if mes == 7:
            print("Verano")
        elif mes == 8:
            print("Verano")
        elif mes == 9 and dia <=20:
            print("Verano")
        else: print("Otoño")
    case 10|11|12:
        if mes == 10:
            print("otoño")
        elif mes == 11:
            print ("Otoño")
        elif mes == 12 and dia <=20:
            print("Otoño")
        else: print("Invierno")