public class Dolar extends Moeda {

    double valorDolar = 5.07;
    String tipo = "Dolar";

    //construtor
    public Dolar(double valor){
        super(valor);
        this.valor = valor;
    }

    //informação sobre a moeda
    @Override
    public void info() {
        System.out.printf("1 Dolar equivale a R$%.2f reais",valorDolar);

    }
    //metodo para converter Dolar para Real
    @Override
    public double converter(double valor) {
        return valor*=valorDolar;
    }
}
