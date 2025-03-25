public class Main {
    public static void main(String[] args) {
        Time maoNegra = new Time("Mão Negra Futebol Clube", "Carlitos");

        Atleta atletaMao1 = new Atleta("Drezão", 22, "Meio-Campo");
        Atleta atletaMao2 = new Atleta("Vanzinho", 18, "Zagueiro");
        Atleta atletaMao3 = new Atleta("Oberto Lopes", 23, "Atacante");

        // adicionando os atletas
        maoNegra.adicionarAtletas(atletaMao1);
        maoNegra.adicionarAtletas(atletaMao2);
        maoNegra.adicionarAtletas(atletaMao3);

        // listar atletas
        maoNegra.listarAtletas();

        // criando e adicionando mais um atleta
        Atleta atleta4 = new Atleta("JP", 23, "Centro-Avante");
        maoNegra.adicionarAtletas(atleta4);

        // listar atletas novamente
        maoNegra.listarAtletas();

        // remover atleta
        maoNegra.removerAtleta("JP");
        // listar atletas novamente
        maoNegra.listarAtletas();


        Time jardimPereba = new Time("Jardim Pereba Futebol Clube", "Petão");
        jardimPereba.listarAtletas();

    }

}
