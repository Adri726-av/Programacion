print("="*50)
print("A) Añadir cliente")
print("V) Validar emails almacenados")
print("C) Contar clientes de un dominio")
print("M) Mostrar los % de clientes premium y normales")
print("G) Salir")
print("="*50)
listaPremiums = []
listaCorreos = []
opcion = input("Elige una opción: ").lower()
while opcion != "a" and opcion != "v" and opcion != "c" and opcion != "m" and opcion != "g":
    opcion = input("Elige una opción válida porfavor: ").lower()
while opcion != "g":
    if opcion == "a":
        premium = input("¿Eres premium? (S/N): ").lower()
        while premium != "s" and premium != "n":
            premium = input("¿Eres premium? (Introduce S o N:").lower()
        listaPremiums.append(premium)
        correo = input("Introduce su correo electrónico: ")
        listaCorreos.append(correo)
    elif opcion == "v":
        incorrectos = []
        for correo in listaCorreos:
            if "@" not in correo:
                incorrectos.append(correo)
            else:
                indice_arroba = correo.find("@")
                parte_despues = correo[indice_arroba + 1:]
                if "." not in parte_despues:
                    incorrectos.append(correo)
        
        print(f"Hay {len(incorrectos)} emails inválidos:")
        for correo in incorrectos:
            print("-", correo)

    opcion = input("Elige una opción: ").lower()