print("=" * 40)
print("a. Introduzca el número de árboles que va a introducir.")
print("b. Tipo de árbol, diámetro y altura. Y si es tipo B, la edad.")
print("c. Resumen de los datos guardados.")
print("d. Resumen de información similar al recuadro.")
print("e. Salir del programa.")
print("=" * 40)
tipo_a = 0
tipo_b = 0
lista_altura = []
lista_edad = []
total_edad = 0
opcion = input("Elige la opción: ").lower()
while opcion != "a" and opcion != "b" and opcion != "c" and opcion != "d":
    opcion = input("Elige una de las opciones correctas porfavor: ")
while opcion != "e":
    if opcion == "a":
        arboles = int(input("Introduce el número de árboles que va a introducir: "))
    elif opcion == "b":
        print(f"Vamos a introducir los datos de los {arboles} árboles")
        for i in range(1, arboles+1):
            tipo = input("Introduce el tipo del arbol (A o B): ").upper()
            while tipo != "A" and tipo != "B":
                tipo = input("Introduce el tipo (A o B porfavor): ").upper()
            if tipo == "A":
                tipo_a += 1
            diametro = int(input("Introduce el diámetro del árbol: "))
            altura = int(input("Introduce la altura del árbol: "))
            lista_altura.append(altura)
            if tipo == "B":
                tipo_b += 1
                edad = int(input("Introduce la edad del árbol: "))
                lista_edad.append(edad)
                total_edad += edad
                
    elif opcion == "c":
        print(f"Por ahora tienes {tipo_a} árboles de tipo A y {tipo_b} árboles de tipo B")
    
    elif opcion == "d":
        max = 0
        for i in lista_altura:
            if i > max:
                max = i
        min = 100000000000
        for i in lista_altura:
            if i < min:
                min = i
        media_edad = total_edad / len(lista_edad)
        limite = 30
        contador_arboles_limite = 0
        for i in lista_altura:
            if i > limite:
                contador_arboles_limite += 1

        print(f"La altura máxima es {max}")
        print(f"La altura mínima es {min}")
        print(f"La media de edad para los de tipo B es de {media_edad} años")
        print(f"Existen {contador_arboles_limite} árboles en total de más de 30m")

    print("a: num de arboles / b: tipo de arbol / c: resumen corto / d: resumen largo / e: salir del programa")
    opcion = input("Elige la opción: ").lower()

print("Saliendo del programa...")