print("="* 30)
print("[R] Registrar Juego")
print("[E] Mostrar Estadisticas")
print("[S] Salir del Programa")
print("[P] Mejor puntuacion")
print("[D] Detalle de un juego")
print("[G] Filtrar por género")
print("="* 30)
lista = ["R", "r", "E", "e", "P", "p"]
listaS = ["S", "s"]
eleccion = input("Selecciona R / E / S / P / D / G: ")

Nombres = ["Dark Souls 1", "Elden Ring", "Zelda"]
Puntuaciones = [9, 10, 8]
Generos = ["accion", "aventura", "aventura"]
Juegos = []

while eleccion not in listaS:

    if eleccion == "R" or eleccion == "r":
        nombre = input("Dame el nombre del juego: ")
        Nombres.append(nombre)

        p = int(input("Dame la puntuacion: "))
        Puntuaciones.append(p)

        genero = input("Dame el genero del juego: ")
        Generos.append(genero)

    elif eleccion == "E" or eleccion == "e":
        print("Tu coleccion de Juegos: ")

        for i in range(len(Nombres)):
            print(f"Nombre: {Nombres[i]} | Puntuacion: {Puntuaciones[i]} | Genero: {Generos[i]}")

    elif eleccion == "P" or eleccion == "p":
        max = 0
        for puntuacion in Puntuaciones:
            if puntuacion > max:
                max = puntuacion
        punMax = Puntuaciones.index(max)
        print(f"Nombre: {Nombres[punMax]} | Puntuacion: {Puntuaciones[punMax]} | Genero: {Generos[punMax]}")
    
    elif eleccion == "D" or eleccion == "d":
        juego = input("Introduce uno de los juegos para ver detalles: ")
        if juego in Nombres:
            numJuego = Nombres.index(juego)
            print(f"Nombre: {Nombres[numJuego]} | Puntuacion: {Puntuaciones[numJuego]} | Genero: {Generos[numJuego]}")
        else: 
            print("Este juego no esta en la lista")
    
    elif eleccion == "G" or eleccion == "g":
        nomgenero = input("Introduce un género: ")
        for i in (0, len(Generos)):
            if Generos[i] == nomgenero:
                Juegos.append(Nombres[i])
                
        print(Juegos)
            
    eleccion = input("Selecciona R, E, S, P, D o G: ")

print("Terminado...")