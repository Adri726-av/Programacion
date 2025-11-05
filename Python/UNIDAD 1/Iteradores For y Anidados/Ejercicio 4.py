num = int(input("Introduce un numero: "))
i = "*"
for i in range(1, num+1):
    if i == 1 or i == num:
        print("*" *num)
    elif i == (num - (num -i)):
        print("*", " " * (num -4) ,"*")