package pack;

public class CarteIdentitate {
    private String cnp;
    private String nume;
    private int age;

    public CarteIdentitate(String cnp, String nume, int age) {
        this.cnp = cnp;
        this.nume = nume;
        this.age = age;
    }

    public String getCNP() {
        return this.cnp;
    }

    public int getAge() {
        return this.age;
    }
}
