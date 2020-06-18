import java.text.SimpleDateFormat;
import java.util.Date;

public class AppleWatch extends Watch {
  // public String getTime() {
  //   SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");

  //   Date date = new Date();
  //   return formatter.format(date);
  // }

  // public void adjustTime() {
  //   System.out.println("Pull the crown and turn it.");
  // }

  // override
  @Override
  public void adjustTime() {
    super.adjustTime();
    System.out.println("Ask to the iPhone.");
  }

  // overloading
  public String getTime(String format) {
      SimpleDateFormat formatter = new SimpleDateFormat(format);
  
      Date date = new Date();
      return formatter.format(date);
    }
}
