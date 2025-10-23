diaSemana = ["Lunes", "Martes", "Miércoles", "Jueves", "Viernes"]
diafinSemana = ["Sábado", "Domingo"]
diaSemana = diaSemana + diafinSemana        # Concatenar listas

    #Recorrer listas
# Recorrido por posición
for i in range(6,-1,-1):
    print(diaSemana[i])
# Recorrido por valor
for dia in diaSemana:
    print(dia)