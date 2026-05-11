package cofrinho;

public abstract class moeda {
    protected double valor;

    public moeda(double valor) {
        this.valor = valor;
    }

    // Cada moeda terá sua própria conversão
    public abstract double converter();

    // Mostra informações da moeda
    public abstract void info();
}