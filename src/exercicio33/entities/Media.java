package exercicio33.entities;

public class Media {
    private String name;
    private Double n1;
    private Double n2;
    private Double n3;
    private Double n4;

    public Media() {
    }

    public Media(Double n1, Double n2, Double n3, Double n4, String name) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.name = name;
    }

    public Double getN1() {
        return n1;
    }

    public void setN1(Double n1) {
        this.n1 = n1;
    }

    public Double getN2() {
        return n2;
    }

    public void setN2(Double n2) {
        this.n2 = n2;
    }

    public Double getN3() {
        return n3;
    }

    public void setN3(Double n3) {
        this.n3 = n3;
    }

    public Double getN4() {
        return n4;
    }

    public void setN4(Double n4) {
        this.n4 = n4;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double calcularMedia() {
        return (n1 + n2 + n3 + n4) / 4;
    }

    public String resultado() {
        double resultado = calcularMedia();
        if (resultado >= 7) {
            return "Aprovado!";
        } else {
            return "Reprovado.";
        }
    }
}
