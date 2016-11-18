/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

/**
 *
 * @author johna
 */
public class Investment {
    
    
    public static void main(String args[]){
        double investment = 14_000;
    
        double firstInvestmentValue = investment + (investment * .40);
        double secondInvestmentValue = firstInvestmentValue - 1500;
        double thirdInvestmentValue = secondInvestmentValue + (secondInvestmentValue * .12);
    
        System.out.println("Initial investment: " + investment);
        System.out.println("Investment after first year: " + firstInvestmentValue);
        System.out.println("Investment after second year: " + secondInvestmentValue);
        System.out.println("Investment after third year: " + thirdInvestmentValue);
    }
    
}
