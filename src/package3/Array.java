package package3;

public class Array {

    private int[] array;

    public void setArray (int[] array) {
        this.array = array.clone();
    }

    public void displayArray() {
        for (int a : this.array) {
            System.out.print(a);
        }
        System.out.println();
    }
}
