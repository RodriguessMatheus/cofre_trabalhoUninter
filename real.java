package cofrinho;

public class real extends moeda {

    public real(double valor) 
    {
        super(valor);
    }

    @Override
    public double converter() 
    {
        return valor; // já está em real
    }

    @Override
    public void info() {
        System.out.println("Real: " + valor);
    }
}