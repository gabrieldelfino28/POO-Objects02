package Model;

public class ContaBancaria {

    public int numeroConta;
    public String nome;
    public double saldo;

    public ContaBancaria() {
        numeroConta = 0;
        nome = "";
        saldo = 0.00d;
    }

    public void realizaDeposito(double valor) {
        saldo += valor;
    }

    public void realizaSaque (double valor) {
        saldo -= valor;
    }

    @Override
    public String toString() {
        return "ContaBancaria -> {" +
                "numeroConta=" + numeroConta +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
