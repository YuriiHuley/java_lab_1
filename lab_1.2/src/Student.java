public class Student {
    String firstname;
    String fathername;
    String surname;
    int age;
    int course;

    public Student() {}

    public Student(String firstname, String fathername, String surname, int age, int course) {
        this.firstname = firstname;
        this.fathername = fathername;
        this.surname = surname;
        this.age = age;
        this.course = course;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setFathername(String lastname) {
        this.fathername = lastname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        if(age >= 17 && age <= 70)
        this.age = age;
        else System.out.println("Wrong Age");
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getFathername() {
        return fathername;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    public void ShowInfo() {
        System.out.println("Student " + firstname + ' ' + fathername + ' ' + surname
                + " age:" + age + " course: " + course);
    }

    public void ShowInfoUpperCase() {
        System.out.println("Student " + firstname.toUpperCase() + ' ' + fathername.toUpperCase().charAt(0) + ' ' + surname.toUpperCase().charAt(0)
                + " AGE:" + age + " COURSE: " + course);
    }
}