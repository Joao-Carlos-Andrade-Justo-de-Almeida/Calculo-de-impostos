package entities;

public class PessoaFisica extends Pessoa {
    private Double medicamentos;
    private static final double TAXA_QUINZE = 15.0;
    private static final double TAXA_VINTECINCO = 25.0;
    private static final Double TAXA_SAUDE = 50.0;

    public PessoaFisica(String nome, Double renda_anual, Double medicamentos) {
        super(nome, renda_anual);
        this.medicamentos = medicamentos;
    }

    public static double getTaxaQuinze() {
        return TAXA_QUINZE;
    }

    public static double getTaxaVintecinco() {
        return TAXA_VINTECINCO;
    }

    public static Double getTaxaSaude() {
        return TAXA_SAUDE;
    }

    public Double getMedicamnetos() {
        return medicamentos;
    }

    public void setMedicamentos(Double medicamentos) {
        this.medicamentos = medicamentos;
    }

    public double taxaImpostoFisica() {
        if (getRenda_anual() <= 20000) {
            return getRenda_anual() * (TAXA_QUINZE / 100);
        } else {
            return getRenda_anual() * (TAXA_VINTECINCO / 100);
        }
    }

    public double saudeAbatimento(){
        return getMedicamnetos() * (TAXA_SAUDE / 100);
    }

    public double totalFisica(){
        return taxaImpostoFisica() - saudeAbatimento();
    }

    @Override
    public String tax(){
        return getNome() + ": $ " + totalFisica();
    }
}
