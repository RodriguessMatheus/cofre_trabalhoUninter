package cofrinho;

public class euro extends moeda 
{

    public euro(double valor) 
    {
        super(valor);
    }

    @Override
    public double converter() 
    {
        return valor * 5.5; // conversão exemplo
    }

    @Override
    public void info() 
    {
        System.out.println("Euro: " + valor);
    }
}