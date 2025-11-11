import random 
apuesta1 = 1
apuesta2 = 1
jugador1 = 0
jugador2 = 0
while not (apuesta1 == 0 and apuesta2 == 0):
    eleccion1 = input("Jugador 1, elige pares o nones: ").lower()
    while eleccion1 != "pares" and eleccion1 !="nones":
        eleccion1 = input("Jugador 1, elige pares o nones porfavor: ").lower()
    apuesta1 = int(input("Jugador 1, elige apuesta (0 al 5): "))
    while apuesta1 < 0 and apuesta1 > 5:
        apuesta1 = int(input("Jugador 1, elige apuesta (0 al 5) porfavor: "))
    apuesta2 = random.randint(0,5)

    if eleccion1 == "pares":
        if apuesta1 + apuesta2 % 2 == 0:
            print("El jugador 1 ha ganado")
            jugador1 += 1
        elif not (apuesta1 + apuesta2 % 2 == 0):
            print("La máquina ha ganado")
            jugador2 += 1
    elif eleccion1 == "nones":
        if not (apuesta1 + apuesta2 % 2 == 0):
            print("El jugador 1 ha ganado")
            jugador1 += 1
        elif apuesta1 + apuesta2 % 2 == 0:
            print("La máquina ha ganado")
            jugador2 += 1

print("El jugador 1 ha ganado", jugador1, "partidas")
print("La máquina ha ganado", jugador2, "partidas")
