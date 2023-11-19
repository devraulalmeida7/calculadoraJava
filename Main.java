import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        // Calculadora 
        Scanner teclado = new Scanner(System.in);

        String valor1;
        String valor2;
        String operacao;
        double total;

        System.out.println("Digite o valor 1");
        valor1 = teclado.nextLine();
        System.out.println("Digite o valor 2");
        valor2 = teclado.nextLine();
        System.out.println("Digite a operação: ");
        operacao = teclado.nextLine();




        switch (operacao){
            case "+":
                total = Double.parseDouble(valor1) + Double.parseDouble(valor2);
                System.out.println("O total foi: " + total);
                break;
            case "-":
                total = Double.parseDouble(valor1) - Double.parseDouble(valor2);
                System.out.println("O total foi: " + total);
                break;
            case "*":
                total = Double.parseDouble(valor1) * Double.parseDouble(valor2);
                System.out.println("O total foi: " + total);
                break;
            case "/":
                total = Double.parseDouble(valor1) / Double.parseDouble(valor2);
                System.out.println("O total foi: " + total);
                break;
        }





    }
}
