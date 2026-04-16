package Banco.src;

import Banco.src.Funcionario;

public class ContaCorrente {

    private Pessoa correntista;
    private long numeroConta;

    public ContaCorrente(Pessoa correntista, long numeroConta) {
        this.correntista = correntista;
        this.numeroConta = numeroConta;
    }

    float saldoEmReais;

    /**
     * Até quanto o saldo da conta pode ficar negativo.
     */
    int limiteDoChequeEspecial;




}
