package view;

import Model.ContaBancaria;

public class Main {

    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria();

        c1.numeroConta = 1548006;
        c1.nome = "Cleiton da Silva";
        c1.saldo = 5000;
        System.out.println(c1);
        c1.realizaDeposito(200);
        System.out.println(c1);
        c1.realizaSaque(400.50);
        System.out.println(c1);
    }
}
