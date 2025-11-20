# cargaCesta
def cargaCesta(gastar):
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

    return lista_productos, lista_precios, lista_productos_superior, gastar, suma_total

def pinteMenu():
    print("Pulse la opcion S para calcular el dinero sobrante")
    print("Pulsa la opcion R para eliminar un producto y su precio de la lista")
    print("Pulsa la opción C para devolver la lista de productos cuyo precio es mas alto que un importe")

# leaOpciones
def leaOpciones():
    opcion = input("Introduce S / R / C:").upper()
    return opcion

# calculeSobrante
def calculeSobrante(gastar, suma_total):
    sobrante = gastar - suma_total
    print(f"El dinero que te sobra es: {sobrante}")
    return sobrante

# eliminaProducto
def eliminaProducto(lista_productos, lista_precios):
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

# calculaListaPrecio

# masAlto

presupuesto = float(input("Dime cuanto tienes para gastarte como maximo"))
resultados = cargaCesta(presupuesto)
pinteMenu()
opcion = leaOpciones()
if opcion == "S":
    sobrante = calculeSobrante(resultados[3], resultados[4])
elif opcion == "R":
    remove = eliminaProducto(resultados[0], resultados[1])
