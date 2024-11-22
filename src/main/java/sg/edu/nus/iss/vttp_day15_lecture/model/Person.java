package sg.edu.nus.iss.vttp_day15_lecture.model;

public class Person {
    // ADD VALIDATION LATER AS PRACTICE
    private Integer id;
    private String fullName;
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Person(Integer id, String fullName, String email) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
    }

    public Person() {

    }

    @Override
    public String toString() {
        return id + "," + fullName + "," + email;
    }
}
