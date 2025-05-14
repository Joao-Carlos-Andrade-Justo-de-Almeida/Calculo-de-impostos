package entities;

public class PessoaJuridica extends Pessoa {
    private Integer funcionario;
    private static final double TAXA_DEZESSEIS = 0.16;
    private static final double TAXA_FUNCIONARIOS = 0.14;

    

    public PessoaJuridica(String nome, Double renda_anual, Integer funcionario) {
        super(nome, renda_anual);
        this.funcionario = funcionario;
    }

    public Integer getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Integer funcionario) {
        this.funcionario = funcionario;
    }

    public static double getTaxaDezesseis() {
        return TAXA_DEZESSEIS;
    }

    public static double getTaxaFuncionarios() {
        return TAXA_FUNCIONARIOS;
    }

    @Override
    public double tax(){
        // Verifica o número de funcionários e aplica a taxa correspondente.
        if(funcionario>10){
            return getRenda_anual() * TAXA_FUNCIONARIOS; // Aplica TAXA_FUNCIONARIOS se o número de funcionários for maior que 10.
        }
        else{
            return getRenda_anual() * TAXA_DEZESSEIS; // Aplica TAXA_DEZESSEIS se o número de funcionários for 10 ou menos.
        }
    }
}