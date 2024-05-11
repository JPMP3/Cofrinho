public class Euro extends Moeda {

    double valorEuro = 5.45;

    //construtor
    public Euro(double valor) {
        super(valor);
        this.valor = valor;
    }
    //informação sobre a moeda
    @Override
    public void info() {
        System.out.printf("1 Dolar equivale a R$ %.2f reais",valorEuro);
    }
    //metodo para converter Euro para Real
    @Override
    public double converter(double valor) {
        return valor *= valorEuro;
    }
}
