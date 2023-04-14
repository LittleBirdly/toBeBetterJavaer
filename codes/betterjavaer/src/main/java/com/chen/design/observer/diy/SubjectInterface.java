package com.chen.design.observer.diy;

public interface SubjectInterface {

    void registObserver(ObInterface o);

    void removeObserver(ObInterface o);

    void notifyObservers();
}
