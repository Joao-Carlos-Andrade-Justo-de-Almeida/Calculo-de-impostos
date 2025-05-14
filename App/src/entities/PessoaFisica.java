package entities;

public class PessoaFisica extends Pessoa {
    private Double medicamentos;
    private static final double TAXA_QUINZE = 0.15;
    private static final double TAXA_VINTECINCO = 0.25;
    private static final Double TAXA_SAUDE = 0.5;

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
    
    @Override
    public double tax(){
    // Variável para armazenar o valor do imposto base.
    double baseTax;
    // Verifica a faixa de renda e aplica a taxa correspondente.
    if(getRenda_anual() < 20000.0){
        baseTax = getRenda_anual() * TAXA_QUINZE; // Aplica 15% para rendas abaixo de 20.000.
    } else {
        baseTax = getRenda_anual() * TAXA_VINTECINCO; // Aplica 25% para rendas acima ou igual a 20.000.
    }

    // Aplica a dedução do imposto de saúde
    return baseTax - (medicamentos * TAXA_SAUDE);
    }
}
