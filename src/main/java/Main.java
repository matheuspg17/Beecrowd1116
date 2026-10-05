
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String[] lista;        
        String linha;
        int num1, num2, controle;
        double resultado;
        
        controle = leia.nextInt();
        leia.nextLine();

        for (int i = 0; i < controle; i++) {
            resultado = 0;
            
            linha = leia.nextLine();
            lista = linha.split(" ");
            num1 = Integer.parseInt(lista[0]);
            num2 = Integer.parseInt(lista[1]);
            
           if (num2 == 0) {
                System.out.println("divisao impossivel");
            }else {
                resultado = (double)num1 / num2;
                System.out.printf("%.1f\n", resultado);
            }
        }
    }
}
