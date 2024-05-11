import java.util.ArrayList;

public class Cofrinho {
    //lista privada de moedas adicionadas no cofre
    private ArrayList<Moeda> moedaLista = new ArrayList<Moeda>();

    //metodo de adicionar moedas instanciadas na classe Main na lista
    public void adicionar(Moeda moeda){
        moedaLista.add(moeda);
        System.out.println("\n\nMoeda Adicionada com sucesso!");
    }

    //metodo para achar e remover moeda desejada da lista fazendo uma busca baseada na Classe especifica e o valor
    public void remover(Moeda moeda){
        System.out.println("Removendo Moeda da lista...");
        int index = 0;
        for( Moeda m : moedaLista){
            //logica para achar o objeto que desejamos remover da lista com precisão
            if (m.valor == moeda.valor && m.getClass().equals(moeda.getClass())){
                index = moedaLista.indexOf(m);
            }
        }
        //verificando se a moeda existe no cofrinho
        System.out.println(index == 0 ? "Moeda não encontrada :/ \nTente novamente" : "Moeda removida com sucesso!");
        moedaLista.remove(index);
    }

    //metodo usado para listar as moedas
    public void listagem(){
        System.out.println("| --- Lista de Moedas --- |");
        for(Moeda m : moedaLista){
            System.out.printf(m.getClass().getSimpleName()+" - R$%.2f \n",m.valor);
        }
        System.out.println("| --- --------------- --- |");
    }

    //metodo usado para calcular o valor total em reais dentro do cofrinho
    public void totalConvertido(){
        double total = 0;
        for (Moeda m : moedaLista){
            total+=m.converter(m.valor);
        }
        System.out.println("| --- Valor total --- |");
        System.out.printf(" Total: R$ %.2f",total);
        System.out.println("\n| --- ----------- --- |");
    }

}
