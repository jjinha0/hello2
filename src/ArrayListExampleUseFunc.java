import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-06.
 */

//1. 함수이용해서 글자 수 평균 구하기
//2. 5글자 이하 리스트 만들기

public class ArrayListExampleUseFunc {
    public static void main(String[] args){

        String review = "나름 괜찮다고 할 수 있으나 백반도 한정식도 아닌" +
                " 어정쩡한 느낌에 쌈을 그다지 좋아하지 않는 사람에겐 좀 쎈 가격";

        List<String> wordList = new ArrayList<String>(Arrays.asList
                (review.split(" ")));


        }
    //글자 수 평균 구하는 함수 avgChar
    //평균 구하려면 글자 수 총 합 알아야하고 몇 덩어린지 알아야하고.
    public static double getAvgFromList(List<String> wordList) {

        //Todo

        return 0;
    }

    //5글자 이하 List 만들기 함수
    public static List<String> creatMaxWordFiveList(List<String> wordList) {
        //Todo
        return null;
    }

    }


