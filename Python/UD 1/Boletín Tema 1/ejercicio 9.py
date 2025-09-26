sueldo_anual = float(input("Introduce su sueldo anual:"))
historial = input("Indica su historial crediticio(negativo o positivo):")
empleo = float(input("Indica el tiempo de su empleo en años:"))
cantidad = float(input("Introduce la cantidad solicitada"))
if historial == "negativo" or empleo < 2 or cantidad > (sueldo_anual * 0.01):
    print ("El préstamo es de riesgo")
else: print ("El préstamo no es de riesgo")