package BankSys;

public class Conta {
    private String id;
    private double saldo;

    public Conta(String id) {
        this.id = id;
        this.saldo = 0.0;
    }

    public void creditar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Valor inválido para crédito.");
        }
    }

    public void debitar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Valor inválido para débito.");
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getId() {
        return this.id;
    }
}
