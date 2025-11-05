mes = ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"]
temperatura = []

for i in range(0,12):
    temp = int(input(f"Temperatura de {mes[i]}: "))
    temperatura.append(temp)

for i in range(0,12):
    print(mes[i], ":" , "*" * temperatura[i], "(" , temperatura[i] ,".0ºC)")