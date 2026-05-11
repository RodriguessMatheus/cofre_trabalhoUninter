package cofrinho;


public class dolar extends moeda 
{

    public dolar(double valor) 
    {
        super(valor);
    }

    @Override
    public double converter() {
        return valor * 5.0; // conversão exemplo
    }

    @Override
    public void info() {
        System.out.println("Dólar: " + valor);
    }
}