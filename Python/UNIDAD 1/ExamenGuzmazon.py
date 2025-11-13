gastar = float(input("Introduce el dinero máximo que te quieres gastar en la compra: "))
lista_productos = []
lista_precios = []
lista_productos_superior = []
suma = 0.0
while suma < gastar:
    producto = input("Introduce el producto: ")
    lista_productos.append(producto)
    precio = float(input("Introduce el precio del producto: "))
    lista_precios.append(precio)
    suma += precio
    if suma > gastar:
        lista_precios.remove(precio)
        suma_total = suma - precio
    if suma > gastar:
        lista_productos.remove(producto)

print(f"Importe máximo a gastar: {gastar}€")
print(f"Productos: {lista_productos}")
print(f"Precios: {lista_precios}")
print(f"Coste total de la cesta: {suma_total}")

print("Pulse la opcion S para calcular el dinero sobrante")
print("Pulsa la opcion R para eliminar un producto y su precio de la lista")
print("Pulsa la opción C para devolver la lista de productos cuyo precio es mas alto que un importe")
opcion = input("Introduce S / R / C:").upper()

while opcion != "S" or opcion != "R" or opcion != "C":

    if opcion == "S":
        sobrante = gastar - suma_total
        print(f"El dinero que te sobra es: {sobrante}")
    
    elif opcion =="R":
        nombre = input("Introduce el nombre de un producto: ")
        print(lista_productos)
        print(lista_precios)
        pregunta = input("Voy a eliminar el producto con ese nombre, ¿estas seguro? (introduce S o N): ").upper()
        if pregunta == "S":
            pos = lista_productos.index(nombre)
            lista_productos.pop(pos)
            lista_precios.pop(pos)
        print(lista_productos)
        print(lista_precios)
    
    else:
        importe = float(input("Introduce un importe: "))
        for precio in lista_precios:
            if precio > importe:
                posicion = lista_productos.index(precio)
                lista_productos_superior.append(lista_productos[posicion])
        print(lista_productos_superior)

    print("Pulse la opcion S para calcular el dinero sobrante")
    print("Pulsa la opcion R para eliminar un producto y su precio de la lista")
    print("Pulsa la opción C para devolver la lista de productos cuyo precio es mas alto que un importe")
    opcion = input("Introduce S / R / C:").upper()