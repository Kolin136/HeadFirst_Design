package com.example.headperst.chat3.additive;

import com.example.headperst.chat3.Beverage;
import com.example.headperst.chat3.CondimentDecorator;

public class Mocha extends CondimentDecorator {

  public Mocha(Beverage beverage) {
    super.beverage = beverage;
  }

  @Override
  public double cost() {
    return super.beverage.cost() + .20;
  }

  @Override
  public String getDescription() {
    return super.beverage.getDescription() +", 모카";
  }
}
