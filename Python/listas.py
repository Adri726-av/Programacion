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