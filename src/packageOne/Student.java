package packageOne;

public class Student {
    private String name;
    private String address;
    private int age;
    private boolean sex;

    protected boolean status;

    public Student(String name, String address, int age, boolean sex, boolean status) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.sex = sex;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", status=" + status +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }


    public void studentEat() {
        System.out.println(this.name + " đang ăn" + " ở " + this.address);
        System.out.println("Giới tính của " + this.name + " là :" + (this.sex ? "nam" : "nu"));
    }
}