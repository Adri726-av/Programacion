import random
print("T) Pulse T para generar un nuevo tablero.")
print("J) Pulse J para jugar.")
print("E) Pulse E para salir del juego")
opcion = input("Elige una opción: ").upper()
while opcion != "T" and opcion != "J" and opcion !="E":
    print("Opción incorrecta")
    print("T) Pulse T para generar un nuevo tablero.")
    print("J) Pulse J para jugar.")
    print("E) Pulse E para salir del juego")
    opcion = input("Elige una opción: ").upper()
while opcion == "T" or opcion == "J" or opcion != "E":
    puntuacion_total = 0
    if opcion == "T":
        tablero = []
        minas_restantes = 0
        print("Generando tablero")
        for i in range(0,8):
            num = random.randint(0,1)
            if num == 0:
                tablero.append(" ")
            else:
                minas_restantes += 1
                tablero.append("X")
        
        print(f"¡Tablero generado! Se han escondido {minas_restantes} minas. Tablero: {tablero}")

    elif opcion == "J":
        if len(tablero) != 8:
            print("Debes generar el tablero antes.")
        else:
            print(f"Tienes que encontrar {minas_restantes} minas.")
            minas = minas_restantes
            posicion = int(input("Introduce una posición (0-7): "))
            while posicion > 7:
                posicion = int(input("Introduce una posicion entre 0 y 7 porfavor: "))
            while minas != 0:
                if tablero[posicion] == "X":
                    puntuacion_total += 1
                    minas -= 1
                    print(f"¡Mina! +1 Punto. Puntuacion: {puntuacion_total} | Minas restantes: {minas}")
                else:
                    puntuacion_total -= 1
                    print(f"Agua... -1 Punto. Puntuacion: {puntuacion_total} | Minas restantes: {minas}")
                posicion = int(input("Introduce una posicion entre 0 y 7 porfavor: "))
            print(f"¡Has encontrado todas las minas! Tu puntuacion final es: {puntuacion_total}")
            print("FIN DEL JUEGO")

    else:
        print("Saliendo")
    
    opcion = input("Elige una opción: ").upper()