package entities;

public class PessoaJuridica extends Pessoa {
    private Integer funcionario;
    private static final double TAXA_DEZESSEIS = 16.0;
    private static final double TAXA_FUNCIONARIOS = 14.0;

    

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

    public double taxaImpostoJuridico(){
        return getRenda_anual() * (getTaxaDezesseis() / 100);
    }

    public double taxaImpostoFuncionario(){
        return getRenda_anual() * (getTaxaFuncionarios() / 100);
    }

    public double totalJuridica(){
        return taxaImpostoJuridico() + taxaImpostoFuncionario();
    }

    @Override
    public String tax(){
        return getNome() + ": $ " + totalJuridica();
    }
}
