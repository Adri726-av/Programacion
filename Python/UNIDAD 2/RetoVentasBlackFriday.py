ventas = [
    ["Portátil", 150, 799.99, 4.5],
    ["Smartphone", 250, 599.99, 4.3],
    ["Auriculares", 400, 49.99, 4.0],
    ["Tablet", 120, 299.99, 3.9],
    ["Monitor", 180, 199.99, 4.2],
    ["Smartwatch", 220, 149.99, 4.1],
    ["Teclado mecánico", 300, 89.99, 4.4],
    ["Ratón gaming", 350, 59.99, 4.0],
    ["Cámara digital", 90, 999.99, 4.6],
    ["Consola", 200, 399.99, 4.7]
]

producto = input("Introduce un producto: ")

def calculaIngreso(ventas, nombreProducto):
    ingresos = 0

    filaProducto = getProducto(ventas, nombreProducto)

    if len(filaProducto) > 0:
        ingresos = filaProducto[1] * filaProducto[2]

    return ingresos


def getProducto(ventas, nombreProducto):
    producto = []

    i = 0

    encontrado = False

    while i < len(ventas) and not encontrado:
        if ventas[i][0] == nombreProducto:
            producto = ventas[i]
            encontrado = True
        else:
            i += 1

    return producto

def productoDestacado(ventas, nombreProducto):
    valoracion = True
    verifico = getProducto(ventas,nombreProducto)
    if verifico[3] >= 4.2:
        valoracion = True
    else:
        valoracion = False
    return valoracion

def getProductosDestacados(ventas):
    lista = []
    for elemento in ventas:
        if productoDestacado(ventas, elemento[0]):
            lista.append(elemento)
    return lista

resultado1 = calculaIngreso(ventas, producto)
print(resultado1)

resultado2 = getProducto(ventas, producto)
print(resultado2)

listaDestacados = getProductosDestacados(ventas)
print(listaDestacados)