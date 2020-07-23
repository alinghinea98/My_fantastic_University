package ro.ibm.summerschool.myfantasticuniversity.orar;

public class Saptamana {

    private String numeZi;
    private String numarSaptamana;

    public Saptamana(String numeZi, String numarSaptamana) {
        this.numeZi = numeZi;
        this.numarSaptamana = numarSaptamana;
    }

    public Saptamana() {

    }

    public String getNumeZi() {
        return numeZi;
    }

    public void setNumeZi(String numeZi) {
        this.numeZi = numeZi;
    }

    public String getNumarSaptamana() {
        return numarSaptamana;
    }

    public void setNumarSaptamana(String numarSaptamana) {
        this.numarSaptamana = numarSaptamana;
    }


    @Override
    public String toString() {
        return "Saptamana{" +
                "numeZi='" + numeZi + '\'' +
                ", numarSaptamana='" + numarSaptamana + '\'' +
                '}';
    }
}
