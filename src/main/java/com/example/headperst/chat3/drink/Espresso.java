package com.example.headperst.chat3.drink;

import com.example.headperst.chat3.Beverage;

public class Espresso extends Beverage {

  public Espresso() {
    super.description= "에스프레소";
  }

  @Override
  public double cost() {
    return 1.99;
  }
}
