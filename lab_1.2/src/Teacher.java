public class Teacher {
    private String surname;
    private String name;
    private String fathername;
    private int age;
    private int rating;

    public Teacher (){

    }
    public Teacher(String surname, String name, String fathername, int age, int rating){
        this.surname = surname;
        this.name = name;
        this.fathername = fathername;
        this.age = age;
        this.rating = rating;
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

    public int getRating() {
        return rating;
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

        if(age >= 23 && age <= 70)
            this.age = age;
        else System.out.println("Wrong Age");
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void ShowInfo() {
        System.out.println("Lecturer " + name + ' ' + fathername + ' ' + surname
                + " age:" + age + " rating " + rating);
    }

    public void ShowInfoUpperCase() {
        System.out.println("TEACHER " + name.toUpperCase() + ' ' + fathername.toUpperCase().charAt(0) + ' ' + surname.toUpperCase().charAt(0)
                + " AGE:" + age + " RATING " + rating);
    }
}
