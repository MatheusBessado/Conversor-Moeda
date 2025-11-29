package uninter;

public class Euro extends Moeda {

    private static final double TaxaDeConversao  = 6.0;

    public Euro(double valorInicial) {
        super(valorInicial);
    }

    @Override
    public void info() {
        System.out.println("Euro - € " + valor);
    }

    @Override
    public double converter() {
        return valor * TaxaDeConversao; // Converte para reais usando a taxa fixa
    }
}



