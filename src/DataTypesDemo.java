public class DataTypesDemo {

    public static void main(String[] args) {
        byte myByte = 50;
        short myShort = 30000;
        int myInt = 200000000;
        long myLong = 1000000000000000L;
        float myFloat = 3.14f;
        double myDouble = 3.14d;
        boolean myBoolean = true;
        char myChar = 'S';

        int newInt = myByte;
        System.out.println(newInt);

        int newIntFromDouble = (int) myDouble;
        System.out.println(newIntFromDouble);



    }
}
