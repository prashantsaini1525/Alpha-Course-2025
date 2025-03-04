public class ArraysArgument {
    public static void update(int marks[], int nonChangable) {
        nonChangable = 10;
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 1; //marks[i] + 1
        }
    }
    public static void main(String[] args) {
        int marks[] = {97,98,99};
        int nonChangable = 5;

        //print our marks in array
        System.out.print("Before update: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();

        //update our marks in array using function
        update(marks, nonChangable);
        System.out.println("Non-changable value: " + nonChangable);

        //print our marks in array
        System.out.print("After update: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
    
}
