cadena = input("Introduzca una cadena con más de 4 caracteres: ")
while len(cadena) <=4:
    cadena = input("Con más de 4 caracteres: ")
cadenaInt = int(cadena)
if cadenaInt % 2 == 0:
    salida = cadena[2] + cadena[4]
    
elif cadenaInt % 3 == 0:
    salida = cadena[1] + cadena[2]
    
elif cadenaInt % 7 == 0:
    salida = cadena [0] + cadena [3]
    
print(salida)