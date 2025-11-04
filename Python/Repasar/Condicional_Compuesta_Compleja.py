letra = input ("Dame opción:")
match letra :
    case "a" | "A":
        print ("Alta")
    case "b" | "B":
        print ("Baja")
    case "c" | "C":
        print("Cambio")
    case _:
        print ("No válido")