package BankSys;

public class Main {
    public static void main(String[] args) {
        // Criando um banco e contas
        // O número máximo de contas é 10 para simplificação
        Banco banco = new Banco("Banco Central", 10);
        Conta conta1 = new Conta("123", 1000.0);
        Conta conta2 = new Conta("456", 500.0);

        // Exibindo mensagens de boas-vindas
        banco.welcome();

        // Cadastrando contas
        banco.cadastrar(conta1);
        banco.cadastrar(conta2);

        // Realizando operações de crédito, débito e transferência
        banco.creditar("123", 200.0);
        banco.debitar("456", 100.0);
        System.out.println("Saldo da conta 123: " + banco.saldo("123"));
        System.out.println("Saldo da conta 456: " + banco.saldo("456"));
        banco.transferir("123", "456", 300.0);
        System.out.println("Saldo da conta 123 após transferência: " + banco.saldo("123"));
        System.out.println("Saldo da conta 456 após transferência: " + banco.saldo("456"));

        // Exibindo mensagens de despedida
        banco.bye();
    }
}