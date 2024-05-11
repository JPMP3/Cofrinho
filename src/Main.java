import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in); //instanciando objeto Scanner como estatico para ser
    //acessado pelo metodo de menu

    public static void main(String[] args) {
        //definições de variaveis e objetos necessarios
        int opt = 0, optMoeda = 0;
        double valor = 0;
        boolean cofreAberto = true; //variavel para controlar o laço de repetição
        Cofrinho cofre = new Cofrinho();

        //laço de repeteção
        do{
                //menu principal
            System.out.println("\n\n|-------------------------------------|");
            System.out.println("COFRINHO: ");
            System.out.println("1 - Adicionar Moeda");
            System.out.println("2 - Remover Moeda");
            System.out.println("3 - Listar Moedas");
            System.out.println("4 - Calcular total convertido para Real");
            System.out.println("0 - Sair\n\n");
            opt = input.nextInt();

            try{
                switch(opt){
                    case 1:
                        optMoeda = moedaMenu(); //menu para selecionar o tipo de moeda

                        System.out.println("Valor: ");
                        valor = input.nextDouble(); //atribuição do valor da moeda
                        //colocando objeto na lista
                        if(optMoeda == 1){
                            cofre.adicionar(new Euro(valor));
                        }else if(optMoeda == 2) {
                            cofre.adicionar(new Dolar(valor));
                        }else{
                            cofre.adicionar(new Real(valor));
                        }
                        //delay "decorativo"
                        Thread.sleep(1800);
                    break;
                    case 2:
                        optMoeda = moedaMenu();

                        System.out.println("Valor: ");
                        valor = input.nextDouble();
                        if(optMoeda == 1){
                            cofre.remover(new Euro(valor));
                        }else if(optMoeda == 2) {
                            cofre.remover(new Dolar(valor));
                        }else{
                            cofre.remover(new Real(valor));
                        }
                        Thread.sleep(2000);
                    break;
                    case 3:
                        System.out.println();
                        cofre.listagem();//chamando metodo de listagem da classe Cofrinho
                        //delay "decorativo"
                        Thread.sleep(2500);
                    break;
                    case 4:
                        cofre.totalConvertido();//chamando metodo para calcular o total dentro do cofre
                        //delay "decorativo"
                        Thread.sleep(2000);
                    break;
                    case 0:
                        //encerrando programa
                        System.out.println("Encerrando o programa...");
                        //delay "decorativo"
                        Thread.sleep(2000);
                        cofreAberto = false;
                    break;
                    default:
                        System.out.println("Opção invalida, tente novamente...");
                        Thread.sleep(2000);
                }
            }catch(InputMismatchException e){
                //tratamento de input
                input.nextLine();
                System.out.println("Erro: "+e);
                System.out.println("Ocorreu um erro ao ler o valor digitado, tente usar somente numeros inteiros...");
            }
            catch (InterruptedException e){
                System.out.println("Erro: "+e);
                System.out.println("Erro no Processo, tente novamente...");
            }
        }while (cofreAberto);
    }

    //metodo responsavel por criar um menu de seleção do tipo de moeda e retornar escolha do usuário
    //para evitar repetição de codigo.
    static int moedaMenu(){
        System.out.println("Escolha a Moeda: ");
        System.out.println("1 - Euro");
        System.out.println("2 - Dolar");
        System.out.println("3 - Real\n");
        return input.nextInt();
    }
}