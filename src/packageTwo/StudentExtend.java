package packageTwo;

import packageOne.Student;

public class StudentExtend extends Student {
    private String test;
    public StudentExtend(String name, String address, int age, boolean sex, boolean status, String test) {
        super(name, address, age, sex, status);
        this.test = test;
    }
    public void main(String[] args) {
        StudentExtend dung2 = new StudentExtend("Dung", "Manh", 22, true, false, "dung");
        dung2.status = true;
        dung2.studentEat();

        System.out.println("áddsasad" + dung2.getName() + dung2.status);
    }


}
