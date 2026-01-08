package Repaso;

public class If {
    static void main(String[] args) {
        int num1 = 8;
        int num2 = 4;
        if(num1 > 10 && num2 > 10)
        {
            System.out.println("Ambos son mayores que 10");
        }
        else
        {
            if (num1 > num2)
            {
                System.out.println("El primero es mayor que el segundo");
            }
            else if (num2 > num1)
            {
                System.out.println("El segundo es mayor que el primero");
            }
        }
    }
}
