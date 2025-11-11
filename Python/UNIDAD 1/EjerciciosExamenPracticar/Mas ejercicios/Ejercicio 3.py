letra = input("Introduce una letra: ").lower()
lista = ["hola", "mamamakio" , "jai", "buenas", "ELDEENRING"]
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
        secuencia = input("Introduce la letra o la secuencia: ")
        for palabra in lista:
            if len(palabra) >= len(secuencia):
                if palabra[:len(secuencia)] == secuencia:
                    if palabra not in lista_empieza:
                        lista_empieza.append(palabra)
        print(f"Palabras que empiezan por la secuencia: {lista_empieza}")
    elif opcion =="C":
        for palabra in lista:
            if letra in palabra:
                if letra not in lista_contiene:
                    lista_contiene.append(palabra)
        print(lista_contiene)
    elif opcion =="L":
        corta = lista[0]
        larga = lista[0]
        for i in lista:
            if len(i) < len(corta):
                corta = i
        for i in lista:
            if len(i) > len(larga):
                larga = i
        print(f"Palabra mas corta: {corta}")
        print(f"Palabra mas larga: {larga}")
    opcion = input("Introduce una opcion: ").upper()
print("Fin del programa")