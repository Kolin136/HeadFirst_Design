package com.example.headperst.chat3.additive;

import com.example.headperst.chat3.Beverage;
import com.example.headperst.chat3.CondimentDecorator;

public class Soy extends CondimentDecorator {
  public Soy(Beverage beverage) {
    super.beverage = beverage;
  }

  @Override
  public double cost() {
    System.out.println("계산");
    return super.beverage.cost() + .40;
  }

  @Override
  public String getDescription() {
    return super.beverage.getDescription() +", 두유";
  }

}
