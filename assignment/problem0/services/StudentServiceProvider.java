package services;

import java.util.Date;
import java.text.SimpleDateFormat;

public class StudentServiceProvider {
  public StudentServiceInterface delegate;

  public void receiveStudentService() {
    StudentService s = delegate.studentService();
    String type = s.getType();
    String application = s.getApplication();
    Date completeDate = s.getCompleteDate();

    SimpleDateFormat dateFormat = new SimpleDateFormat("EE MMM d");

    System.out.printf("Your Application for %s applied.\nApplication File: %s\nIt will complete at: %s\n", type, application, dateFormat.format(completeDate));
  }
}