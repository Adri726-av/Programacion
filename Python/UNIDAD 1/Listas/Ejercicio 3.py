import random
diaSemana = ["Lunes", "Martes", "Miércoles", "Jueves", "VIernes", "Sábado", "Domingo"]
print(diaSemana[6])

listacinco = []
for i in range (0,5):
    aleatorio = random.randint(0,8)
    listacinco.append(aleatorio)
print(listacinco)

listamultiplos = []
for i in range (0,30,3):
    listamultiplos.append(i)
print(listamultiplos)

listamultiplos.insert(8,"programo")
print(listamultiplos)