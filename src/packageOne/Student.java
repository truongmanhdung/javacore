package packageOne;

public class Student {
    private String name;
    private String address;
    private int age;
    private boolean sex;

    protected boolean status;


//    Overloading là hàm trong một lớp có chung tên nhưng khác tham số truyền vào
    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String address) {
        this(name);
        this.address = address;
    }

    public Student(String name, String address, int age) {
        this(name, address);
        this.age = age;
    }

    public Student(String name, String address, int age, boolean sex) {
        this(name, address, age);
        this.sex = sex;
    }
    public Student(String name, String address, int age, boolean sex, boolean status) {
        this(name, address, age, sex);
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
    public void studentEat(String test) {
        System.out.println(this.name + " đang ăn" + " ở " + this.address + test);
        System.out.println("Giới tính của " + this.name + " là :" + (this.sex ? "nam" : "nu"));
    }
}
