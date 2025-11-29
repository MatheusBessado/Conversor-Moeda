package uninter;

public class Real extends Moeda {

    public Real(double valorInicial) {
        super(valorInicial);
    }

    @Override
    public void info() {
        System.out.println("Real - R$ " + valor);
    }

    @Override
    public double converter() {
        return valor; 
        
    
 }
}
