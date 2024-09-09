public class Main {
    public static void main(String[] args) {
        //Imprimindo com o sout iterando 2 vezes no Array
        String padrao = Processamento.padrao();
        //Imprimindo com o sout iterando 1 vezes no Array
        String padraoUnico = Processamento.padraoUnico();
        //Imprimindo após a construção do StringBuilder iterando 2 vezes no Array
        String stringBuilder = Processamento.builderDuplo();
        //Imprimindo após a construção do StringBuilder iterando 2 vezes no Array
        String stringBuilderUnico = Processamento.builderUnico();

        System.out.println("Foi realizado alguns testes para ver qual seria a melhor performance printando todos os valores com Print normal para cada valor e Montando o StringBuilder.");
        System.out.println(padrao);
        System.out.println(padraoUnico);
        System.out.println(stringBuilder);
        System.out.println(stringBuilderUnico);
    }
}