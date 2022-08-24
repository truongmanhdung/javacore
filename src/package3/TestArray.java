package package3;

public class TestArray {
    public static void main(String[] args) {
        Array a = new Array();
        int[] mang = {1,2,3};
        a.setArray(mang);
        a.displayArray();
        mang[1] = 3;
        a.displayArray();
    }
}
