incidente = ""
incidentes = 0
graves = 0
leves = 0
eso = 0
post_obligatoria = 0


while incidente !="N":
    incidente = input("¿Desea registrar un nuevo incidente? S (para Sí) o N (para No): ").upper()
    if incidente == "S":
        incidentes += 1
        nivel = input("¿En qué nivel ha ocurrido? E (para los incidentes de la ESO) o P (para los incidentes de Post-Obligatoria): ").upper()
        while nivel != "E" and nivel != "P":
            nivel = input("¿En que nivel ha ocurrido? Introduce E (ESO) o P (Post-Obligatoria)")
        if nivel == "E":
            eso += 1
        else:
            post_obligatoria += 1
        tipo = input("¿Qué tipo de incidente ha ocurrido: , tipo de incidente : L ( para incidentes Leves)  o G (para incidentes Graves ) ?: ").upper()
        while tipo != "L" and tipo !="G":
            tipo = input("¿Qué tipo de incidente ha ocurrido? Introduce L (leves) o G (graves) porfavor: ").upper()
        if tipo == "L":
            leves += 1
        else:
            graves += 1

porcentajeEso = eso * 100 / incidentes
porcentajePost = post_obligatoria * 100 / incidentes
print(f"Se han producido {incidentes} en el centro: {leves} de ellos Leves y {graves} Graves, siendo el {porcentajeEso} % en ESO y el {porcentajePost} % en Post-Obligatoria.")