public class Dekan {
    private String surname;
    private String name;
    private String fathername;
    private int age;
    private int experience;


    public Dekan (){

    }
    public Dekan(String surname, String name, String fathername, int age, int experience){
        this.surname = surname;
        this.name = name;
        this.fathername = fathername;
        this.age = age;
        this.experience = experience;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getFathername() {
        return fathername;
    }

    public int getAge() {
        return age;
    }

    public int getExperience() {
        return experience;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public void setAge(int age) {
        if(age >= 25 && age <= 70)
            this.age = age;
        else System.out.println("Wrong Age");
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void ShowInfo() {
        System.out.println("Dean " + name + ' ' + fathername + ' ' + surname
                + " age:" + age + " years of experience " + experience);
    }

    public void ShowInfoUpperCase() {
        System.out.println("DEKAN " + name.toUpperCase() + ' ' + fathername.toUpperCase().charAt(0) + ' ' + surname.toUpperCase().charAt(0)
                + " AGE:" + age + " YEARS OF EXPERIENCE " + experience);
    }
}
