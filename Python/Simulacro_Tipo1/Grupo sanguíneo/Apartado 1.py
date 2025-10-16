grupo_sanguíneo1 = input("Introduce un grupo sanguíneo (A, B, AB o 0): ").upper()
grupo_sanguíneo2 = input("Introduce otro grupo sanguíneo (A, B, AB o 0): ").upper()

match grupo_sanguíneo1:
    case "A":
        if grupo_sanguíneo2 == "B":
            print("No son compatibles")
        elif grupo_sanguíneo2 == "AB":
            print("Son compatibles, A es donante de AB")
        elif grupo_sanguíneo2 == "0":
            print("Son compatibles, A es receptor de 0")
        elif grupo_sanguíneo2 == "A":
            print("Son compatibles, A es donante y receptor de A")
    case "B":
        if grupo_sanguíneo2 == "A":
            print("No son compatibles")
        elif grupo_sanguíneo2 == "AB":
            print("Son compatibles, B es donante de AB")
        elif grupo_sanguíneo2 == "0":
            print("Son compatibles, B es receptor de 0")
        elif grupo_sanguíneo2 == "B":
            print("Son compatibles, B es donante y receptor de B")
    case "AB":
        if grupo_sanguíneo2 == "A":
            print("Son compatibles, AB es receptor de A")
        elif grupo_sanguíneo2 == "B":
            print("Son compatibles, AB es donante de B")
        elif grupo_sanguíneo2 == "0":
            print("Son compatibles, AB es receptor de 0")
        elif grupo_sanguíneo2 == "AB":
            print("Son compatibles, AB es donante y receptor de AB")
    case "0":
        if grupo_sanguíneo2 == "A":
            print("Son compatibles, 0 es donante de A")
        elif grupo_sanguíneo2 == "B":
            print("Son compatibles, 0 es donante de B")
        elif grupo_sanguíneo2 == "AB":
            print("Son compatibles, 0 es donante de AB")
        elif grupo_sanguíneo2 == "0":
            print("Son compatibles, 0 es donante y receptor de 0")