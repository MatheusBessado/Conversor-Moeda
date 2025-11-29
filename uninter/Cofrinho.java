package uninter;
import java.util.ArrayList;
import java.util.List;

public class Cofrinho {
    private List<Moeda> moedas;

    public Cofrinho() {
        moedas = new ArrayList<>();
    }

    public void adicionarMoeda(Moeda moeda) {
        moedas.add(moeda);
    }

    public void removerMoeda(Moeda moeda) {
        if (moedas.contains(moeda)) {
            moedas.remove(moeda);
        } else {
            System.out.println("Moeda não encontrada.");
        }
    }

    public void listarMoedas() {
        if (moedas.isEmpty()) {
            System.out.println("O cofrinho está vazio.");
        } else {
            for (Moeda moeda : moedas) {
                System.out.println(moeda);
            }
        }
    }

    public double calcularValorConvertido() {
        double total = 0;
        for (Moeda moeda : moedas) {
            total += moeda.converter();
        }
        return total;
    }
}
