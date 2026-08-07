package exercicio34.entities;

public class Pagamento {
    private Double valor;

    public Pagamento(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public double tipo(String metodo) {
        if (metodo.equalsIgnoreCase("À vista")) {
            return valor - (valor * 0.15);
        } else if (metodo.equalsIgnoreCase("À vista no cartão de crédito")) {
            return valor - (valor * 0.10);
        } else if (metodo.equalsIgnoreCase("Parcelado em duas vezes")) {
            return valor;
        } else if (metodo.equalsIgnoreCase("Parcelado em três vezes")) {
            return valor * 1.15;
        } else {
            System.out.println("Método inválido.");
            return 0;
        }
    }
}
