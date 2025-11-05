mes = int(input("Introduce un número del mes"))
match mes:
    case "1"|"2"|"3":
        print("Invierno")
    case "4"|"5"|"6":
        print("Primavera")
    case "7"|"8"|"9":
        print("Verano")
    case "10"|"11"|"12":
        print("otoño")