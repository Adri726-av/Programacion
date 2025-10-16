dia = int(input("Dime un día: "))
mes = int(input("Dime un mes: "))
año = int(input("Dime un año: "))

enero=31
febrero=28
marzo=31
abril=30
mayo=31
junio=30 
julio=31
agosto=31
septiembre=30
octubre=31
noviembre=30
diciembre=31

match mes:
    case 1:
        print("Han pasado", dia , "días")
    case 2:
        suma=enero + dia
        print("Han pasado", suma , "días")
    case 3:
        suma=enero + febrero + dia
        print("Han pasado", suma, "días")
    case 4:
        suma=enero + febrero + marzo + dia 
        print("Han pasado", suma, "días")
    case 5:
        suma=enero + febrero + marzo + abril + dia
        print("Han pasado", suma, "días")
    case 6:
        suma=enero + febrero + marzo + abril + mayo + dia
        print("Han pasado", suma, "días")
    case 7:
        suma=enero + febrero + marzo + abril + mayo + junio + dia
        print("Han pasado", suma, "días")
    case 8: 
        suma= enero + febrero + marzo + abril + mayo + junio + julio + dia 
        print("Han pasado", suma, "días")
    case 9:
        suma= enero + febrero + marzo + abril + mayo + junio + julio + agosto + dia
        print("Han pasado", suma, "días")
    case 10: 
        suma= enero + febrero + marzo + abril + mayo + junio + julio + agosto + septiembre + dia
        print("Han pasado", suma, "días")
    case 11:
        suma= enero + febrero + marzo + abril + mayo + junio + julio + agosto + septiembre + octubre + dia
        print("Han pasado", suma, "días")
    case 12:
        suma= enero + febrero + marzo + abril + mayo + junio + julio + agosto + septiembre + octubre + noviembre + dia
        print("Han pasado", suma, "días")