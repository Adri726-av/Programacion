diaSemana = input("Dime un día de la semana:")
match diaSemana :
    case "L" | "M" | "X" | "J" | "V":
        print ("Instituto")
    case "S" | "D":
        print ("Casa")
    case _:
        print ("No válido")