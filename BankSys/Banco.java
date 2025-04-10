package BankSys;

public class Banco {
    private Conta[] contas; // Array de contas, tamanho 10 para simplificação
    private int contador = 0; // Contador de contas cadastradas
    private String nome; // Nome do banco

    public Banco(String nome, int numMaximoContas) {
        this.nome = nome;
        this.contas = new Conta[numMaximoContas];
        System.out.println("Banco criado com sucesso!");
    }

    public void welcome() {
        System.out.println("Bem-vindo ao banco " + nome + "!");
        System.out.println("Número máximo de contas: " + contas.length);
        System.out.println("Número de contas cadastradas: " + contador);
    }

    public void bye() {
        System.out.println("Obrigado por usar o banco " + nome + "!");
        System.out.println("Número de contas cadastradas: " + contador);
    }

    public void cadastrar(Conta conta) {
        if (contador < contas.length) {
            contas[contador] = conta;
            contador++;
            System.out.println("Conta cadastrada com sucesso!");
        } else {
            System.out.println("Limite de contas atingido.");
        }
    }

    private Conta procurar(String id) {
        for (int i = 0; i < contador; i++) {
            if (contas[i].getId().equals(id)) {
                return contas[i];
            }
        }
        System.out.println("Conta não encontrada.");
        // Retorna null se a conta não for encontrada
        // Isso pode ser tratado de forma diferente, dependendo da lógica do seu
        // programa
        return null;
    }

    public void creditar(String id, double valor) {
        Conta conta = procurar(id);
        if (conta != null) {
            conta.creditar(valor);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public void debitar(String id, double valor) {
        Conta conta = procurar(id);
        if (conta != null) {
            conta.debitar(valor);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public double saldo(String id) {
        Conta conta = procurar(id);
        if (conta != null) {
            return conta.getSaldo();
        } else {
            System.out.println("Conta não encontrada.");
            return -1;
        }
    }

    public void transferir(String idOrigem, String idDestino, double valor) {
        Conta contaOrigem = procurar(idOrigem);
        Conta contaDestino = procurar(idDestino);
        if (contaOrigem != null && contaDestino != null) {
            contaOrigem.debitar(valor);
            contaDestino.creditar(valor);
        } else {
            System.out.println("Uma ou ambas as contas não foram encontradas.");
        }
    }
}