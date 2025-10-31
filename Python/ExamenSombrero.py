import random
Gryffindor = 0
Slytherin = 0
Hufflepuff = 0
Ravenclaw = 0
total = 0
print("===============================")
print("SOMBRERO SELECCIONADOR")
print("===============================")
print("1. Seleccionar casa para un alumno")
print("2. Mostrar estadísticas")
eleccion = int(input("Elige una opción. Si quieres salir del programa, escirbe la opción 1 y el nombre del personaje innombrable: "))
nombre_alumno = input("Introduce el nombre del alumno: ")
while eleccion != 1 and eleccion != 2:
    eleccion = int(input("Elige una opción valida: "))   
while nombre_alumno != "Voldemort":  
    if eleccion == 1:
        print("Ejecutando y seleccionando casa")  
        numero = random.randint(1,4)
        match numero:
            case 1:
                print("El sombrero dice que", nombre_alumno, "pertenece a Gryffindor")
                Gryffindor += 1
            case 2:
                print("El sombrero dice que", nombre_alumno, "pertenece a Slytherin")
                Slytherin += 1
            case 3:
                print("El sombrero dice que", nombre_alumno, "pertenece a Hufflepuff")
                Hufflepuff += 1
            case 4:
                print("El sombrero dice que", nombre_alumno, "pertenece a Ravenclaw")
                Ravenclaw += 1
    
    else:
        total = Gryffindor + Slytherin + Hufflepuff + Ravenclaw
        print("Ejecutando y mostrar estadísticas")
        print("Total de alumnos: ",total,)
        print("Gryffindor:",Gryffindor)
        print("Slytherin:",Slytherin)
        print("Hufflepuff:",Hufflepuff)
        print("Ravenclaw",Ravenclaw)
    eleccion = int(input("Elige una opción. Si quieres salir del programa, escirbe la opción 1 y el nombre del personaje innombrable: "))
    nombre_alumno = input("Introduce el nombre del alumno: ")
print("Apparition, transpórtame a otro sitio")

