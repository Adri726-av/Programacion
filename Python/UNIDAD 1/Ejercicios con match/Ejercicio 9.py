import random
print("============================")
print ("  PIEDRA PAPEL O TIJERAS")
print("============================")
humano = int(input("Introduce 0 para piedra, 1 para papel y 2 para tijera:"))
maquina = random.randint(0,2)
match humano:
    case 0:
        match maquina:
            case 0:
                print("¡Empate!")
            case 1:
                print("Perdiste")
            case 2:
                print("¡Has ganado!")
    case 1:
        match maquina:
            case 0:
                print("¡Has ganado!")
            case 1:
                print("¡Empate!")
            case 2:
                print("Has perdido")
    case 2:
        match maquina:
            case 0:
                print("Has perdido")
            case 1:
                print("¡Has ganado!")
            case 2:
                print("¡Empate!")