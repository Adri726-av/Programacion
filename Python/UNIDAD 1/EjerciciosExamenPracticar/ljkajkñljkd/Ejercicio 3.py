letra = input("Introduce una letra: ").lower()
lista = []
palabra = ""
while palabra != "stop":
    palabra = input("introduce palabras, escribe stop si no deseas guardar más palabras: ")
    if palabra != "stop":
        lista.append(palabra)
print(f"Letra introducida: {letra}")
print(f"La lista de palabras es {lista} y el número de palabras introducidas es {len(lista)}")

print("="*30)
print("Introduzca E si desea devolver la lista de palabras que comienzan por la letra")
print("Introduzca C si desea devolver la lista de palabras que contienen la letra")
print("Introduzca S para terminar el programa")
print("Introduzca L para devolver la lista de palabras ordenadas por su longitud")
print("="*30)
opcion = input("Introduce una opcion: ").upper()
lista_empieza = []
lista_contiene =[]
lista_ordenada = []
while opcion != "S":
    if opcion == "E":
        for palabra in lista:
           if  palabra[0] == letra:
               lista_empieza.append(palabra)
        print(lista_empieza)
    elif opcion =="C":
        for palabra in lista:
            if letra in palabra:
                lista_contiene.append(palabra)
        print(lista_contiene)
    elif opcion =="L":
        for i in lista:
            len(i) >
    opcion = input("Introduce una opcion: ").upper
print("Fin del programa")