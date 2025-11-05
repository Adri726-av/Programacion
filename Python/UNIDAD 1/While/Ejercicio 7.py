import random
maquina = random.randint(1,10)
usuario = int(input("Adivina el numero: "))
while usuario != maquina:
    print("No has adivinado el numero: ")
    usuario = int(input("Intenta adivinarlo otra vez: "))
print("Lo has adivinado")