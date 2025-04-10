package BankSys;

public class Main {
    public static void main(String[] args) {
        Conta conta;
        conta = new Conta("21.342-7");
        conta.creditar(500.87);
        conta.debitar(45.00);
        System.out.println(conta.getSaldo());
    }
}