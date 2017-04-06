/**
 * Created by danawacomputer on 2017-04-06.
 */
public class ArrayExample {

    public static void main(String[] args){

        int[] iArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 ,15,
                16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

        //accumulate
        int sum = 0;

        for(int e : iArr) {
            sum += e; // sum = sum + e;
            }

            int countOfArray = iArr.length; //int에서 length와 String에서 length()차이 뭘까!
            System.out.println(sum / countOfArray);
    }
}
