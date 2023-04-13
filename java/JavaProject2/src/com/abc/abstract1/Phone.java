package com.abc.abstract1;
/**
 * Created by shankar on 3/23/2023.
 */
public interface  Phone {
    void call();
}

interface  BasicPhone{
    void call();
    void message();
}

interface SmartPhone   extends  Phone,BasicPhone{
      void playVideo();
      void playeGame();
}


