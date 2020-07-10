package service1;

import java.text.SimpleDateFormat;

public class StudentServiceProvider extends Provider<StudentService> {
  StudentServiceInterface delegate;

  @Override
  public void receiveService() {
    StudentService s = this.delegate.studentService();

    SimpleDateFormat dateFormat = new SimpleDateFormat("EE MMM d");

    System.out.printf("Your Application for %s applied.\nApplication File: %s\nIt will complete at: %s\n",
      s.getType(), s.getApplication(), dateFormat.format(s.getCompleteDate())
    );
  }
}