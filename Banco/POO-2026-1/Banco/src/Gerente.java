package Banco.src;

import java.util.ArrayList;

import static Banco.src.Banco.salarioBase;

public class Gerente extends Funcionario{

    private ArrayList<Funcionario> subordinados;

    public Gerente(int cpf, String nome, ArrayList<Funcionario> subordinados) {
        super(cpf, nome);
        setSalario(2 * salarioBase);
        this.subordinados = new ArrayList<>();
    }

    public void imprimirEquipe(){
        for (Funcionario funcionario : subordinados) {
            System.out.println(funcionario);
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", tamanho da equipe = " + subordinados.size();
    }
}
