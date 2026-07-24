public class ArrayExample {

    public static void main(String[] args) {

        String[] students = {"Prashant", "Shefali", "Priya", "Abhishek"};
        int[] numbers = {1, 5, 10, 100};

        System.out.println(students[0]);

        students[0] = "Kishan";
        System.out.println(students[0]);

        System.out.println("There are " + students.length + " students in the array");

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        for(int j : numbers) {
            System.out.println(j);
        }
    }
}