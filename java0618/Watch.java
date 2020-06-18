import java.text.SimpleDateFormat;
import java.util.Date;

public class Watch {
  public String getTime() {
    SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");

    Date date = new Date();
    return formatter.format(date);
  }

  public void adjustTime() {
    System.out.println("Pull the crown and turn it.");
  }
}
