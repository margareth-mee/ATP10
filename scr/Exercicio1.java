import java.util.Scanner;

/*Crie um programa em linguagem Java que solicita ao usuário que digite a idade, 
armazene em uma variável do tipo byte e imprima uma mensagem para idade maior que 25 anos, 
outra mensagem para idade menor que 25 e uma outra mensagem se idade igual a 25 anos.
*/

public class Exercicio1{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        byte age = getNumber("Digite sua idade: ");
        
        if(age > 25){
            System.out.println("Idade maior que 25 anos.");
        }else if (age < 25){
            System.out.println("Idade menor que 25 anos.");
        }else{
            System.out.println("Idade igual a 25 anos");
        }
    }

    static byte getNumber(String message){
        System.out.print(message);
        byte number = Byte.parseByte(sc.nextLine()); 
        return number; 
    }

}

