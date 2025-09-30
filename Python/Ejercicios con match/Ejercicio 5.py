print("1. Habitación Azul")
print("2. Habitacion Roja")
print("3. Habitación Verde")
print("4. Habitación Rosa")
print("5. Habitación Gris")
habitación = int(input("Introduzca un número de habitación:"" "))
match habitación:
    case 1:
        print("Primera planta y con 2 camas")
    case 2:
        print("Primera planta y con 1 cama")
    case 3:
        print("Segunda planta y con 3 camas")
    case 4:
        print("Segunda planta y con 2 camas")
    case 5:
        print("Tercera planta y con 1 cama")