package BankSys;

import BankSys.bancos.BancoArray;
import BankSys.contas.Conta;
import BankSys.contas.Poupanca;

public class Main {
    public static void main(String[] args) {
        // Criando um banco e contas
        // O número máximo de contas é 10 para simplificação
        BancoArray banco = new BancoArray("Banco Central", 10);
        Conta conta1 = new Conta("123", 1000.0);
        Conta conta2 = new Conta("456", 500.0);
        Poupanca contaPoupanca1 = new Poupanca("789", 2000.0);
        Poupanca contaPoupanca2 = new Poupanca("101", 1500.0);

        // Cadastrando contas
        banco.cadastrar(conta1);
        banco.cadastrar(conta2);
        banco.cadastrar(contaPoupanca1);
        banco.cadastrar(contaPoupanca2);

        // Exibindo mensagens de boas-vindas
        banco.welcome();

        // Realizando operações de crédito, débito e transferência
        // Contas comum
        banco.creditar("123", 200.0);
        banco.debitar("456", 100.0);
        System.out.println("Saldo da conta 123: " + banco.saldo("123"));
        System.out.println("Saldo da conta 456: " + banco.saldo("456"));
        banco.transferir("123", "456", 300.0);
        System.out.println("Saldo da conta 123 após transferência: " + banco.saldo("123"));
        System.out.println("Saldo da conta 456 após transferência: " + banco.saldo("456"));

        // Contas poupança
        banco.creditar("789", 500.0);
        banco.debitar("101", 200.0);
        System.out.println("Saldo da conta Poupança 789: " + banco.saldo("789"));
        System.out.println("Saldo da conta Poupança 101: " + banco.saldo("101"));
        banco.transferir("789", "101", 700.0);
        System.out.println("Saldo da conta Poupança 789 após transferência: " + banco.saldo("789"));
        System.out.println("Saldo da conta Poupança 101 após transferência: " + banco.saldo("101"));

        // Realizando operações exclusivas para contas poupança
        contaPoupanca1.renderJuros(5.0); // Rendimento de 5%
        System.out.println("Saldo da conta Poupança 789 após rendimento: " + banco.saldo("789"));
        contaPoupanca2.renderJuros(3.0); // Rendimento de 3%
        System.out.println("Saldo da conta Poupança 101 após rendimento: " + banco.saldo("101"));

        // Exibindo mensagens de despedida
        banco.bye();
    }
}