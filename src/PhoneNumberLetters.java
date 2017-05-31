import java.util.ArrayList;
import java.util.List;

/**
 * Created by kcurti205 on 5/26/2017.
 */
public class PhoneNumberLetters {
    public List<String> letterCombinations(String digits) {
        if(digits == null){
            return null;
        }
        String[][] dictionary = {
            {" "},//0
            {""},{"a","b","c"},{"d","e","f"},//123
            {"g","h","i"},{"j","k","l"},{"m","n","o"},//456
            {"p","q","r","s"},{"t","u","v"},{"w","x","y","z"}//789
        };
        List<String> result = new ArrayList<>();
        return result;
    }
}
