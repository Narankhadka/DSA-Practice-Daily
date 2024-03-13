package Day1_Array;

import java.util.Arrays;

public class Array {
    private int[] marks; // Declaring marks as a member variable

    public Array(int[] marks) {
        this.marks = marks;
    }

    public int[] update() {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
        return marks;
    }

    @Override
    public String toString() {
        return "Array{" +
                "marks=" + Arrays.toString(marks) +
                '}';
    }

    public static void main(String[] args) {
        int marks[] = {97, 99, 94};
        Array array = new Array(marks);
        System.out.println(Arrays.toString(array.update()));
    }
}
