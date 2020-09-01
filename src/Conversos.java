import java.util.Scanner;

public class Conversos {
    public static void main(String args[]){

            Pilha p = new Pilha();

            int resto;
            Scanner sc =  new Scanner(System.in);
            int numero = sc.nextInt();
            while (numero != 0){
                resto = numero % 2; //resto da divisao deste numero por 2
                p.push(resto); //armazeno na pilha
                numero = numero / 2; // gero um novo numero resultado da divisao
            };
            // exibir os restos
            while(!p.isEmpty()){
                resto = p.pop();
                System.out.print(resto);
            }
        System.out.print("\nFIM DO PROGRAMA");
    }
}
