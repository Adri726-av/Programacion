diaSemana = ["Lunes", "Martes", "Miércoles"]
diafinSemana = ["Sábado", "Domingo"]
print(diaSemana[2])                     # Lectura por posición
diaSemana.append("Jueves")              # Agrego variable al final de la lista (sin número)
diaSemana.insert(4,"Viernes")           # Agrego variable a posición concreta (con número)
diaSemana = diaSemana + diafinSemana    # Concateno dos listas
diaSemana.pop(4)                        # Borrado por posición
diaSemana.remove("Martes")              # Borrado por valor
print(diaSemana)
print(len(diaSemana))                   # Para contar los elementos de la lista
print(diaSemana[-len(diaSemana)])       #print(diaSemana[0])

if "Martes2" in diaSemana:              #Para comprobar si la lista contiene un valor o no
    print("Está")
    print(diaSemana.index("Lunes"))     # Para escribir por pantalla en que posición esta Lunes
else:
    print("No está")

print(diaSemana[0:len(diaSemana)])      # Lista completa
print(diaSemana[1:3])                   # Para escribir por pantalla los elementos de la lista de el rango 1:3 (el 3 no lo escribe)

diaSemana = diaSemana + diafinSemana    # Concatenar listas

                # Recorrer listas:
# Recorrido por posición
for i in range(len(diaSemana)):
    print(diaSemana[i])

# Recorrido por valor
for dia in diaSemana:
    print(dia)

# Imprimir la palabra mas corta y más larga de una lista

    corta = lista[0]
    larga = lista[0]
    for i in lista:
        if len(i) < len(corta): # para la palabra mas corta
            corta = i
    for i in lista:
        if len(i) > len(larga): # para la palabra mas larga
            larga = i
    print(f"Palabra mas corta: {corta}")
    print(f"Palabra mas larga: {larga}")

# Imprimir el juego con la puntuacion mas ata de una lista
max = 0
for puntuacion in Puntuaciones:
    if puntuacion > max:
        max = puntuacion
punMax = Puntuaciones.index(max)
print(f"Nombre: {Nombres[punMax]} | Puntuacion: {Puntuaciones[punMax]} | Genero: {Generos[punMax]}")