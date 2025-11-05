puntaje_credito = float(input("Cual es tu puntaje de credito:"))
ingreso_anual = float(input("Cual es tu ingreso anual:"))
if puntaje_credito > 700 and ingreso_anual >=60000:
    print ("Tienes derecho a un prestamo hipotecario")
else: print ("No tienes derecho a un prestamo hipotecario")