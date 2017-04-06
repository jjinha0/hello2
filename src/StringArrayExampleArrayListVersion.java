import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-06.
 */
public class StringArrayExampleArrayListVersion {

    public static void main(String[] args){

        String[] strArr = {"최우영스시", "은행골", "돌배기집", "육식예찬", "낭만부대찌개",
                "숟가락반상마실", "스시메이진", "맛찬들", "철판목장", "용호낙지"};

//        List<String> goumet = new ArrayList<>(); // <> generic이라는 문법.
//        goumet.add("숟가락반상마실");
//        goumet.add("스시메이진");
//        ...

        List<String> goumet = Arrays.asList("최우영스시", "은행골", "돌배기집", "육식예찬", "낭만부대찌개",
                "숟가락반상마실", "스시메이진", "맛찬들", "철판목장", "용호낙지");

        List<String> goumetUnderThreeChar = new ArrayList<>();

        for(String e : goumet) {
            if(e.length() <= 3) {
                goumetUnderThreeChar.add(e);
            }
        }
        //새로 만들어진 리스트 출력
        for(String e : goumetUnderThreeChar) {
            System.out.println(e);
        }
    }
}
