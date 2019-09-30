package earlyjava.exceptions.filearray;

public class FileArrayClass {

    public static void main(String[] args) throws Exception {
        int[] array = {3, 6, 3, 7, 4, 8, 6, 4, 2, 7};
        int[] newArray = new int[array.length];

        FileArray.writeArray("array.dat", array);

        FileArray.readArray("array.dat", newArray);
        for (int i : newArray)
            System.out.println(i);


    }

}
