public class Time {

    private String nomeTime;
    private String tecnico;

    public Time() {
    }

    public Time(String nomeTime, String tecnico) {
        this.nomeTime = nomeTime;
        this.tecnico = tecnico;
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

    @Override
    public String toString() {
        return "Time{" +
                "nomeTime='" + nomeTime + '\'' +
                ", tecnico='" + tecnico + '\'' +
                '}';
    }
}
