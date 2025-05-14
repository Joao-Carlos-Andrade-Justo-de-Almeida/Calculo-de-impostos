import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<Pessoa>list = new ArrayList<>();


        char resp;

        System.out.print("Digite o número de contribuinte: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println("Contribuinte #" + i);
            System.out.print("Individual ou Empresa: ");
            resp = sc.next().charAt(0);
            if(resp == 'i'){
                System.out.print("Nome: ");
                String nome = sc.next();
                System.out.print("Renda Anual: ");
                Double renda_anual = sc.nextDouble();
                System.out.print("Despesas com saúde: ");
                Double medicamentos = sc.nextDouble();
                list.add(new PessoaFisica(nome,renda_anual,medicamentos));
            }
            else{
                System.out.print("Nome: ");
                String nome = sc.next();
                System.out.print("Renda Anual: ");
                Double renda_anual = sc.nextDouble();
                System.out.print("Números de funcionários: ");
                Integer funcionario = sc.nextInt();
                list.add(new PessoaJuridica(nome, renda_anual, funcionario));
            }
        }
        System.out.println();
        System.out.println("Valores de taxas paga: ");
        // Exibe o nome da pessoa e o valor do imposto formatado com duas casas decimais.
        for(Pessoa ps:list){
            System.out.println(ps.getNome() + "$ " + String.format("%.2f", ps.tax()));
        }
        System.out.println();

        double somaImpostos = 0.0;

        // Soma o imposto de cada pessoa ao total acumulado.
        for (Pessoa ps : list) {
            somaImpostos += ps.tax();
        }
        sc.close();

        System.out.printf("Total de impostos pagos: R$ %.2f%n ", somaImpostos);
    }
}
