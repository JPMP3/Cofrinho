public abstract class Moeda {
    double valor;

    //construtor
    public Moeda(double valor){
        this.valor = valor;
    }
    //metodo abstrato para pegar informações de cada moeda
    public abstract void info();
    //metodo abstrato para converter
    public abstract double converter(double valor);
}
