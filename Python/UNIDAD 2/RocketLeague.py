def Menu():
    print("(A) Registrar puntuaciones del equipo")
    print("(L) Listar equipos y su puntuacion por fase")
    print("(C) Clasificados por fase")
    print("(S) Salir")

    opcion = input("Introduce una opción: ").upper()

    while opcion != "A" and opcion != "L" and opcion != "C" and opcion != "S":
        print("Opción incorrecta")
        print("(A) Registrar puntuaciones del equipo")
        print("(L) Listar equipos y su puntuacion por fase")
        print("(C) Clasificados por fase")
        print("(S) Salir")
        opcion = input("Introduce una opción: ").upper() 
    if opcion == "S":
        print("Saliendo del programa")

    return opcion

eleccion = Menu()