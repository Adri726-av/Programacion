opcion=""
while opcion!="S":
    print("R) Registra operaciones de equipo")
    print("L) Listar equipo y su puntuacion por fase")
    print("C) Clasificacion por fase")
    print("S) Salir")
    opcion=input("Elige una de las opciones del menu:").upper()
    if opcion=="R":
        fase=""
        while fase!="inicial" and fase!="semifinal" and fase!="final" :
            fase=input("Di la fase actual: inicial, semifinal o final:")
        def Registropuntuaciones (fase):
            inicial=False
            semifinal=False
            final=False
            matrizestadistica=[]
            c1=0
            if fase=="inicial":     
                inicial=True           
                for datos in range (8):
                    
                    estadistica=[]
                    nombre=input(f"dime el nombre del equipo {c1}")
                    puntos=input(f"dime los puntos del equipo {c1}")
                    c1+=1
                    estadistica.append(nombre)
                    estadistica.append(puntos)
                    matrizestadistica.append(estadistica)
            elif fase=="semifinal":
                semifinal=True
                for datos in range (4):
                    estadistica=[]
                    nombre=input(f"dime el nombre del equipo {c1}")
                    puntos=input(f"dime los puntos del equipo {c1}")
                    c1+=1
                    estadistica.append(nombre)
                    estadistica.append(puntos)
                    matrizestadistica.append(estadistica)
            elif fase=="final":
                final=True
                for datos in range (2):
                    estadistica=[]
                    nombre=input(f"dime el nombre del equipo {c1}")
                    puntos=input(f"dime los puntos del equipo {c1}")
                    c1+=1
                    estadistica.append(nombre)
                    estadistica.append(puntos)
                    matrizestadistica.append(estadistica)
            
            print("=============================")
            print("Datos registrados correctamente")
            print("=============================")
            print(matrizestadistica)
            return matrizestadistica , inicial, semifinal, final         
        datos, inicial, semifinal, final = Registropuntuaciones(fase)
    elif opcion=="L":
            
            fase=""
            
            while fase!="INICIAL" and fase!="SEMIFINAL" and fase!="FINAL" :
                fase=input("Di la fase actual: inicial, semifinal o final:").upper()
                def listarPuntuacionesEquipo (fase):
                    if fase=="INICIAL" and inicial==True:
                        print("============================")
                        print("Fase Inicial")
                        print("============================")
                        for i in range (8):
                            print(f"El equipo {datos [i][0]} ha obtenido {datos[i][1]} puntos")
                    elif fase=="SEMIFINAL" and semifinal==True:
                        print("============================")
                        print("Fase Semifinal")
                        print("============================")
                        for i in range (4):
                            print(f"El equipo {datos [i][0]} ha obtenido {datos[i][1]} puntos")
                    elif fase=="FINAL" and final==True:
                        print("============================")
                        print("Fase Final")
                        print("============================")
                        for i in range (2):
                            print(f"El equipo {datos [i][0]} ha obtenido {datos[i][1]} puntos")
                    else:
                        print("==========================")
                        print("La Fase XXXXXXX no ha sido registrada en el sistema")
                        print("==========================")
                listarPuntuacionesEquipo(fase)    
    elif opcion =="C":
        fase=""
        while fase!="INICIAL" and fase!="SEMIFINAL" and fase!="FINAL" :
            fase=input("Di la fase actual: inicial, semifinal o final:").upper()
            def calculaClasificados (fase,datos):
                if fase=="INICIAL" and inicial==True:
                        print("============================")
                        print("Clasificado Inicial")
                        print("============================")
                        top = []
                        for x in datos:                             
                                max_puntos = -1
                                max_equipo = None                               
                                for equipo in datos:
                                    puntos = int(equipo[1])
                                    if puntos > max_puntos:
                                        max_puntos = puntos
                                        max_equipo = equipo
                                top.append(max_equipo)
                                datos.remove(max_equipo)
                        print (top)   
                             
                elif fase=="SEMIFINAL" and semifinal==True:
                        print("============================")
                        print("Clasificado Semifinal")
                        print("============================")
                        top = []
                        for x in datos:                             
                                max_puntos = -1
                                max_equipo = None                               
                                for equipo in datos:
                                    puntos = int(equipo[1])
                                    if puntos > max_puntos:
                                        max_puntos = puntos
                                        max_equipo = equipo
                                top.append(max_equipo)
                                datos.remove(max_equipo)
                        print (top) 
                        
                elif fase=="FINAL" and final==True:
                        print("============================")
                        print("Clasificado Final")
                        print("============================")
                        top = []
                        for x in datos:                             
                                max_puntos = -1
                                max_equipo = None                               
                                for equipo in datos:
                                    puntos = int(equipo[1])
                                    if puntos > max_puntos:
                                        max_puntos = puntos
                                        max_equipo = equipo
                                top.append(max_equipo)
                                datos.remove(max_equipo)
                        print (top) 

                       
                else:
                        print("==========================")
                        print("La Fase XXXXXXX no ha sido registrada en el sistema")
                        print("==========================")
            calculaClasificados (fase,datos)    



                    



    