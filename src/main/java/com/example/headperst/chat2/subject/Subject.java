package com.example.headperst.chat2.subject;


import com.example.headperst.chat2.observer.Observer;

public interface Subject {

  public void registerObserver(Observer o);

  public void removeObserver(Observer o);

  public void notifyObservers();
}
