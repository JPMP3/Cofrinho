public class Real extends Moeda {
    double valorReal = 1;

    public Real(double valor) {
        super(valor);
        this.valor = valor;
    }
    @Override
    public void info() {
        System.out.printf("1 Dolar equivale a R$ %.2f reais",valorReal);
    }
    @Override
    public double converter(double valor) {
        return valor*=valorReal;
    }
}
