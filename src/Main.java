public class Main {
    public static void main(String[] args) {
        Atleta atleta1 = new Atleta("Marcão", 22, "Centro-avante");
        Time time1 = new Time("Jardim Pereba Futebol Clube", "Charles Bryson");

        System.out.println(atleta1.toString());
        System.out.println(time1.toString());
    }

}
