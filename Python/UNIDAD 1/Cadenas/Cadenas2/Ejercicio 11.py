cad = "123456789"
salida = ""
contador = 0
for i in range(len(cad)-3, 0,-3):
    salida = "." + cad[i:i+3] + salida
    contador += 3
resto = cad[0:len(cad)-contador]
salida = resto + salida
print(salida)