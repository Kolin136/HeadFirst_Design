package com.example.headperst.chat3;

import com.example.headperst.chat3.additive.Mocha;
import com.example.headperst.chat3.additive.Soy;
import com.example.headperst.chat3.additive.Whip;
import com.example.headperst.chat3.drink.Espresso;
import com.example.headperst.chat3.drink.HouseBlend;
import com.example.headperst.chat3.drink.MilkTea;

public class StarbuzzCoffee {

  public static void main(String[] args) {
    Beverage beverage = new Espresso();
    System.out.println(beverage.getDescription() + " $"+beverage.cost());

    Beverage beverage2 = new HouseBlend();
    beverage2 = new Soy(beverage2);
    beverage2 = new Mocha(beverage2);
    beverage2 = new Whip(beverage2);
    System.out.println(beverage2.getDescription() + " $"+beverage2.cost());

    Beverage beverage3 = new MilkTea();
    beverage3 = new Soy(beverage3);
    System.out.println("시작후");
    beverage3 = new Mocha(beverage3);
    beverage3 = new Whip(beverage3);
    System.out.println("하하"+beverage3);
    System.out.println(beverage3.getDescription() + " $"+beverage3.cost());
  }

}
