import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-06.
 */
public class ArrayListExample {

    public static void main(String[] args){
        String review = "나름 괜찮다고 할 수 있으나 백반도 한정식도 아닌" +
                " 어정쩡한 느낌에 쌈을 그다지 좋아하지 않는 사람에겐 좀 쎈 가격";

        //1. review 스트링을 리스트로 변환
        //공백을 기준으로 전체를 워드단위로 짤라서 리스트를 만든다.

        List<String> wordList = new ArrayList<String>(Arrays.asList
                                (review.split(" ")));

        //2. 리스트를 순회해서 전체 단어의 글자수의 평균을 구한다.
        double wordListLength = 0.0;
        int count = 0;
        List<String> resultList = new ArrayList<String>(Arrays.asList());

        for(String e : wordList) {
            wordListLength += e.length();
            count++;


        }

        wordListLength /= count;

        for(String e : wordList) {
            if(e.length() <= 5) {
                resultList.add(e);
            }

        }

        System.out.println("평균 글자 개수는" + wordListLength + "개 입니다.");
        System.out.println(resultList);
        //3. 단어가 5자 이하인 새로운 리스트를 생성한다.

    }
}
