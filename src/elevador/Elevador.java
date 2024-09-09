package elevador;

import java.util.Scanner;

public class Elevador {
    
    public static void main(String[] args) {
       ClasseElevador elevador = new ClasseElevador(10,7);
       Scanner scanner = new Scanner(System.in);
       int escolha = 0;
       do{
           
           System.out.println(">>>MENU ELEVADOR<<<");
           System.out.println("1.Entrar\n2.Sair\n3.Subir\n4.Descer\n5.Parar programa");
           escolha = scanner.nextInt();
           switch (escolha){
               case 1:
                   elevador.entrar();
                   break;
               case 2:
                   elevador.sair();
                   break;
               case 3:
                   elevador.subir();
                   break;
               case 4:
                   elevador.descer();
                   break;
               case 5:
                   System.out.println("Encerrando programa...");
                   break;
                   
               default:
                   System.out.println("Opcao invalida!");
                   
           }
       }while(escolha!=5);
    }
    
}
