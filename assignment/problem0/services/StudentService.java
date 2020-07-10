package services;

import java.util.Calendar;
import java.util.Date;

public class StudentService {
  private String type;
  private String application;
  private Date completeDate;

  public StudentService(String type, String application) {
    this.type = type;
    this.application = application;

    Calendar appliedDate = Calendar.getInstance();

    // Applicaiton takes always a day to complete
    appliedDate.set(Calendar.DATE, appliedDate.get(Calendar.DATE) + 1);
    this.completeDate = appliedDate.getTime();
  }

  public String getType() {
    return this.type;
  }
  public String getApplication() {
    return this.application;
  }
  public Date getCompleteDate() {
    return this.completeDate;
  }
}