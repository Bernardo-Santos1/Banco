package Banco.src;
import Banco.src.Pessoa;
import Banco.src.Banco;

import static Banco.src.Banco.salarioBase;

public class Funcionario extends Pessoa{
    private int matricula;
    private float salario = salarioBase;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void imprimirContracheque(String mes){
        System.out.println("Salario de " + mes + ": " + salario );
    }

    public Funcionario(int cpf, String nome) {
        super(cpf, nome);
    }

    @Override
    public String toString() {

        return super.toString() + ", matricula = " +  matricula +
                ", salário = " + salario;
    }
}
