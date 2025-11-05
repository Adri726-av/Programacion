import random
rondas_jugador = 0
rondas_maquina = 0
partidas = 0
jugador = int(input("Cuantas piedras quieres mostrar (del 0 al 5): "))
while jugador <0 or jugador >5:
    jugador = int(input("Valor fuera de rango, intentelo otra vez: "))
apuesta_jugador = input("Introduce tu apuesta, Par (P) o Impar (I): ")
maquina = random.randint(0,5)
apuesta_maquina = random.randint(1,2)
while not (jugador == maquina):
    suma = maquina + jugador
    print("La suma entre la máquina:", maquina, ", y jugador:", jugador, ", es de:", suma)
    if suma % 2 == 0:
        if apuesta_jugador == "P":
            print("Ha ganado el jugador")
            rondas_jugador += 1
        elif apuesta_jugador == "I":
            print("Ha ganado la máquina")
            rondas_maquina += 1
    else:
        if apuesta_jugador == "P":
            print("Ha ganado la máquina")
            rondas_maquina += 1
        elif apuesta_jugador == "I":
            print("Ha ganado el jugador")
            rondas_jugador += 1
    partidas += 1
    jugador = int(input("Cuantas piedras quieres mostrar (del 0 al 5): "))
    while jugador <0 or jugador >5:
        jugador = int(input("Valor fuera de rango, intentelo otra vez: "))
    apuesta_jugador = input("Introduce tu apuesta, Par (P) o Impar (I): ")
    maquina = random.randint(0,5)
    apuesta_maquina = random.randint(1,2)
print("El jugador ha ganado", rondas_jugador, "rondas")
print("La máquina ha ganado", rondas_maquina, "rondas")
print("Numero total de partidas:", partidas, "partidas")
print("Fin")