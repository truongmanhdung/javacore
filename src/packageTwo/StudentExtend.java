package packageTwo;

import packageOne.Student;

public class StudentExtend extends Student {
//    cha có thì con có, con có chưa chắc cha đã có
    public String test;

    @Override
    public String toString() {
        return "StudentExtend{}";
    }

    public StudentExtend(String name, String address, int age, boolean sex, boolean status, String test) {
        super(name, address, age, sex, status);
        this.test = test; //Overriding là con ghi đè thuộc tính của cha, có thể chống Overriding bằng cách thêm final
    }

    public static void main(String[] args) {
        StudentExtend dung2 = new StudentExtend("Dung", "Manh", 22, true, false, "test");
        dung2.status = true;

        System.out.println("áddsasad" + dung2.getName() + dung2.status);
        System.out.println(dung2.test);
    }

    public void studentEat(){
        super.studentEat();
        System.out.println("đây là Overriding hàm");
    }

}
