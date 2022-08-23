package packageTwo;

import packageOne.Student;

public class StudentExtend extends Student {
    public StudentExtend(String name, String address, int age, boolean sex, boolean status) {
        super(name, address, age, sex, status);
    }

    public static void main(String[] args) {
        StudentExtend dung2 = new StudentExtend("Dung", "Manh", 22, true, false);
        dung2.status = true;

        System.out.println("áddsasad" + dung2.getName() + dung2.status);
    }

}
