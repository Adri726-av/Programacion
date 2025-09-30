dia = input("Dime un dia de la semana:")
dia = dia.upper()
match dia:
    case "LUNES":
        print ("======================")
        print ("LUNES")
        print ("======================")
        print ("8-9 FOL")
        print ("9-10 EDE")
        print ("10-11 PROG")
        print ("11-11:30 Recreo")
        print ("11:30-12 PROG")
        print ("12-14 BBDD")
        print ("======================")
    case "MARTES":
        print ("======================")
        print ("MARTES")
        print ("======================")
        print ("8-10 PROG")
        print ("10-11 LENG")
        print ("11-11:30 Recreo")
        print ("11:30-12:30 LENG")
        print ("12:30-13:30 LENG")
        print ("13:30-14:30 IPE I")
        print ("======================")
    case "SABADO" | "DOMINGO":
        print ("Día de estudio y reflexión")
    case _:
        print ("Valor incorrecto")