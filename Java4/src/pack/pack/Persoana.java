package pack;

public class Persoana {
    private CarteIdentitate ci;
    static int ObiecteInstantiate;
    private LoggingSingleton log = LoggingSingleton.getLog();

    public Persoana(String cnp, String nume, int age) {
        this.ci = new CarteIdentitate(cnp, nume, age);
        ObiecteInstantiate++;
        log.setMessage("Persoana noau creata");
    }

    public Persoana(CarteIdentitate createdCI) {
        this.ci = createdCI;
        ObiecteInstantiate++;
        log.setMessage("Persoana noau cu Ci vechi");
    }

    public String getCNP() {
        log.setMessage("GetCNP called");
        return ci.getCNP();
    }

    public int getAge() {
        log.setMessage("getAge called");
        return ci.getAge();

    }

}
