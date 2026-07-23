package exercicio5.entities;

import java.util.Scanner;

public class Bank {

    public int numeroConta;
    public String nome;
    public char deposito;
    public double valor;
    public double valorDeposito;
    public double valorSaque;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Bank() {

    }

    public Bank(int numeroConta, String nome) {
        this.numeroConta = numeroConta;
        this.nome = nome;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void confirmacao(char deposito, double valor) {
        Scanner scanner = new Scanner(System.in);
        if (deposito == 's') {
            System.out.println("Qual o valor do seu depósito: ");
            valor = sc.nextDouble(); 
        } else if(deposito == 'n') {
            valor = 0.00;
        }

    }
}
