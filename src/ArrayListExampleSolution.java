import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-06.
 */
public class ArrayListExampleSolution {

    public static void main(String[] args){

        String review = "나름 괜찮다고 할 수 있으나 백반도 한정식도 아닌" +
            " 어정쩡한 느낌에 쌈을 그다지 좋아하지 않는 사람에겐 좀 쎈 가격";

        //1.review스트링을 리스트로 변환
        //공백을 기준으로 분리 (공백을 딜리미터로 분리)
        String[] splitted = review.split(" ");
        List<String> wordList = Arrays.asList(splitted);



        //2.리스트를 순회해서 전체 단어의 글자수의 평균을 구한다.
        int wordTotalCount = 0;
        for (String e : wordList) {
            wordTotalCount += e.length();
        }
        System.out.printf("글자수 평균은 %d개 입니다.\n", wordTotalCount/wordList.size());

        //3.단어가 3자 이하인 새로운 리스트를 생성한다.
        List<String> newList = new ArrayList<>();

        for(String e : wordList) {
            if (e.length() <= 3) {
                newList.add(e);
            }
        }
        System.out.println(newList);
    }
    }

