incidente = ""
incidentes = []
graves = []
leves = []
eso = []
post_obligatoria = []

while incidente !="N":
    incidente = input("¿Desea registrar un nuevo incidente? S (para Sí) o N (para No): ").upper()
    if incidente == "S":
        incidentes.append(".")
        nivel = input("¿En qué nivel ha ocurrido? E (para los incidentes de la ESO) o P (para los incidentes de Post-Obligatoria): ").upper()
        while nivel != "E" and nivel != "P":
            nivel = input("¿En que nivel ha ocurrido? Introduce E (ESO) o P (Post-Obligatoria)")
        if nivel == "E":
            eso.append(".")
        else:
            post_obligatoria.append(".")
        tipo = input("¿Qué tipo de incidente ha ocurrido: , tipo de incidente : L ( para incidentes Leves)  o G (para incidentes Graves ) ?: ").upper()
        while tipo != "L" and tipo !="G":
            tipo = input("¿Qué tipo de incidente ha ocurrido? Introduce L (leves) o G (graves) porfavor: ").upper()
        if tipo == "L":
            leves.append(".")
        else:
            graves.append(".")

print(f"Se han producido {len(incidentes)} en el centro: {len(leves)} de ellos Leves y {len(graves)} Graves, siendo el ")