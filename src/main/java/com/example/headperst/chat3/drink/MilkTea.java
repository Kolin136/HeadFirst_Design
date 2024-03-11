package com.example.headperst.chat3.drink;

import com.example.headperst.chat3.Beverage;

public class MilkTea extends Beverage {

  public MilkTea() {
    super.description = "밀크티";
  }

  @Override
  public double cost() {
    return .89;
  }
}
