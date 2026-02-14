package app.entities;

public class User {
    private String name;
    private String lastName;
    private String gender;
    private int age;
    private String email;

    public User(){}
    public User(String name, String lastName, String gender, int age, String email){
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return "User{" + "name ='" + name + '\'' +
                ", lastName ='" + lastName  + '\'' +
                ", gender ='" + gender  + '\'' +
                ", age ='" + age  + '\'' +
                ", email ='" + email  + '\'' +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != user.age) return false;
        if (gender != user.gender) return  false;

        if (name == null) {
            if (user.name != null) return false;
        } else if (!name.equals(user.name)) {
            return false;
        }

        if (lastName == null) {
            if (user.lastName != null) return false;
        } else if (!lastName.equals(user.lastName)) {
            return false;
        }

        if (email == null) {
            return user.email == null;
        } else {
            return email.equals(user.email);
        }
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }
}
