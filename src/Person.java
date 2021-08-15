public class Person {
    String name;
    String ci;
    String birthDate;
    int phone;
    String address;
    char gender;

    public Person(){}

    public Person(String name){
        this.name = name;
    }

    public Person(String name, String ci, String birthDate, int phone, String address, char gender) {
        this.name = name;
        this.ci = ci;
        this.birthDate = birthDate;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
}
