saldo = float(input("Introduce cuanto saldo tienes:"))
retiro = float(input("Introduce la cantidad que desee retirar:"))
if saldo >= retiro:
    print ("Si tienes suficiente saldo en la cuenta para retirar esa cantidad")
else:
    print ("No tienes suficiente saldo en la cuenta")