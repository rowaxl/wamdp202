package service1;

public abstract class Provider<T> {
  public ServiceInterface delegate;

  public abstract void receiveService();
}