package com.example.headperst.chat3.additive;

import com.example.headperst.chat3.Beverage;
import com.example.headperst.chat3.CondimentDecorator;

public class Whip extends CondimentDecorator {

  public Whip(Beverage beverage) {
    super.beverage = beverage;
  }

  @Override
  public double cost() {
    return super.beverage.cost() + .30;
  }

  @Override
  public String getDescription() {
    return super.beverage.getDescription() +", 휘핑크림";
  }
}
