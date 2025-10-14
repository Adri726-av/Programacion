dia = int(input("Introduce el día: "))
mes = int(input("introduce el mes: "))
hemisferio = input("Introduce el hemisferio: ")
while hemisferio != "norte" and hemisferio !="sur":
    hemisferio = input("Valor incorrecto (norte o sur): ")
while (hemisferio == "norte" or hemisferio =="sur") and (dia <= 31 or mes <= 12):
    if hemisferio == "norte":
        match mes:
            case 9 | 10 | 11 | 12:
                if mes == 9 and dia <=22:
                    print("Verano")
                if mes == 9 and dia >= 23:
                    print("Otoño")
                if mes == 10:
                    print("Otoño")
                if mes == 11:
                    print("Otoño")
                if mes == 12 and dia <=20:
                    print("Otoño")
                if mes == 12 and dia >=21:
                    print("Invierno")
            case  1 | 2 | 3:
                if mes == 1:
                    print("Invierno")
                if mes == 2:
                    print("Invierno")
                if mes == 3 and dia <=20:
                    print("Invierno")
                if mes == 3 and dia >=21:
                    print("Primavera")
            case 4 | 5 | 6:
                if mes == 4:
                    print("Primavera")
                if mes == 5:
                    print("Primavera")
                if mes == 6 and dia <=20:
                    print("Primavera")
                if mes == 6 and dia >=21:
                    print("Verano")
            case 7 | 8:
                if mes == 7:
                    print("Verano")
                if mes == 8:
                    print("Verano")
    
    elif hemisferio == "sur":
        match mes:
            case 9 | 10 | 11 | 12:
                if mes == 9 and dia <=22:
                    print("Invierno")
                if mes == 9 and dia >=23:
                    print("Primavera")
                if mes == 10:
                    print("Primavera")
                if mes == 11:
                    print("Primavera")
                if mes == 12 and dia <=20:
                    print("Primavera")
                if mes == 12 and dia >=21:
                    print("Verano")
            case 1 | 2 | 3:
                if mes == 1:
                    print("Verano")
                if mes == 2:
                    print("Verano")
                if mes == 3 and dia <=20:
                    print("Verano")
                if mes == 3 and dia >=21:
                    print("Otoño")
            case 4 | 5 | 6:
                if mes == 4:
                    print("Otoño")
                if mes == 5:
                    print("Otoño")
                if mes == 6 and dia <= 20:
                    print("Otoño")
                if mes == 6 and dia >=21:
                    print("Invierno")
            case 7 | 8:
                if mes == 7:
                    print("Invierno")
                if mes == 8:
                    print("Invierno")

    dia = int(input("Introduce el dia: "))
    mes = int(input("Introduce el mes: "))
    hemisferio = input("Introduce el hemisferio: ")
print("Fin del programa")