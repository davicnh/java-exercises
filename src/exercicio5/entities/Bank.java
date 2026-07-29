package exercicio5.entities;

public class Bank {

    private int numero;
    private String nome;
    private double extrato;

    public Bank(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public Bank(int numero, String nome, double depositoInicial) {
        this.numero = numero;
        this.nome = nome;
        deposito(depositoInicial);
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getExtrato() {
        return extrato;
    }

    public void deposito(double valor) {
        extrato += valor;
    }

    public void saque(double valor) {
        extrato = (extrato - valor) -5;
    }

    public String toString() {
        return "Conta: " + numero + ", Dono: " + nome + ", Extrato: " + extrato;
    }
}
