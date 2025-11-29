package uninter;

public abstract class Moeda {
    protected double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    // Método abstrato para pegar informaçoes da classe principal
    public abstract void info();

    public abstract double converter(); // Metodo para conversao
}

