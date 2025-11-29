package uninter;

public class Dolar extends Moeda {

    private static final double TaxaDeConversao = 5.7;

    public Dolar(double valorInicial) {
        super(valorInicial);
    }

    @Override
    public void info() {
        System.out.println("Dólar - $ " + valor);
    }

    @Override
    public double converter() {
        return valor * TaxaDeConversao; // Metodo para a conversao em reais
    }
}
