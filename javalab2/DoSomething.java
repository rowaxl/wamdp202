import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class DoSomething {
  final static String BLANK = " ";

  public static String substringBlank(String str) {
    String result = new String();
    for (char c : str.toCharArray()) {
      result += c == BLANK.toCharArray()[0] ? "" : c;
    }

    return result;
  }
}