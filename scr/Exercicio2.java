import java.util.Scanner;

/*Crie um programa em linguagem Java que solicita ao usuário que digite o salário, 
armazene em uma variável do tipo double e imprima uma mensagem caso o salário seja maior que R$ 1997,58,
 outra mensagem se o salário for maior que R$5399,99 e outra mensagem se o salário digitado 
 for menor ou igual a zero. Caso o salário seja menor igual a zero o sistema deve solicitar 
 que o usuário digite o salário novamente para então realizar as validações de faixas salariais 
 mais uma vez até que o usuário digite um valor acima de zero.
*/

public class Exercicio2{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double salario = 0;

        do {
            salario = getNumber("Digite o valor o salário: ");

            if(salario > 5399.99){
                System.out.println("Salário maior que R$5399,99.");

            }else if (salario > 1997.58){
                System.out.println("Salário maior que R$1997,58.");

            }else if (salario <= 0 ){
                System.out.println("O salário deve ser maior que 0.");

            }else{
                System.out.println("O valor do salário é: " + salario);
            }

        }while(salario <= 0);

    }
    static double getNumber(String message){
        System.out.print(message);
        double number = Double.parseDouble(sc.nextLine()); 
        return number; 
    }

}