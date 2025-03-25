import java.util.ArrayList;
import java.util.List;

public class Time {

    private String nomeTime;
    private String tecnico;
    private List<Atleta> atletas;

    public Time() {
        this.atletas = new ArrayList<>();
    }

    public Time(String nomeTime, String tecnico) {
        this.nomeTime = nomeTime;
        this.tecnico = tecnico;
        this.atletas = new ArrayList<>();
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public List<Atleta> getAtletas() {
        return atletas;
    }

    public void adicionarAtletas(Atleta atleta) {
        this.atletas.add(atleta);
        System.out.println("Atleta " + atleta.getNome() + " adicionado ao time " + nomeTime);
    }

    public void listarAtletas() {
        if (atletas.isEmpty()) {
            System.out.println("\nNenhum atleta cadastrado no time " + nomeTime + ". Adicione algum atleta!");
        } else {
            System.out.println("\nLista de Atletas do Time " + nomeTime + ":");
            for (Atleta atleta : atletas) {
                System.out.println(atleta);
            }
        }
    }

    public void removerAtleta(String nomeAtleta) {
        Atleta atletaRemovido = null;
        for (Atleta atleta : atletas) {
            if (atleta.getNome().equalsIgnoreCase(nomeAtleta)) {
                atletaRemovido = atleta;
                break;
            }
        }
        if (atletaRemovido != null) {
            atletas.remove(atletaRemovido);
            System.out.println("Atleta " + nomeAtleta + " removido do time " + nomeTime);
        } else {
            System.out.println("Atleta " + nomeAtleta + " não encontrado no time " + nomeTime);
        }
    }

    @Override
    public String toString() {
        return "Time{" +
                "nomeTime='" + nomeTime + '\'' +
                ", tecnico='" + tecnico + '\'' +
                '}';
    }
}
