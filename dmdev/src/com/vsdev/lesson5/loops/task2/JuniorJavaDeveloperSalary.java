package com.vsdev.lesson5.loops.task2;

import java.text.DecimalFormat;

public class JuniorJavaDeveloperSalary {

	/**
	 * Программист Ваня сразу после окончания курсов dmdev устроился в IT компанию
	 * на позицию Junior Java Developer с зарплатой 600$ в месяц. 
	 * Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев. 
	 * 300$ в месяц Ваня тратит на еду и развлечения. 
	 * 10% от зарплаты Ваня ежемесячно переводит на счет брокера, 
	 * чтобы инвестировать в акции с доходностью 2% в месяц.
	 * 
	 * Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера
	 * за 3 года и 2 месяца.
	 * 
	 * Для интереса: попробовать увеличить процент, которые Ваня инвестирует из
	 * своей зарплаты
	 */
	private static DecimalFormat df = new DecimalFormat("0.00");
	private static int amountOfMonth = 12 * 3 + 2;	
	private static int salaryPerMonth = 600;
	private static int salaryIncrease = 400;
	private static int totalSalary = 0;		
	private static int entertainment = 300;	
	private static int amountOfMoneyInvested = 0;			
	private static double investmentPercentage = 0.1;	
	private static double brokerageAccount = 0;
	private static double dividends = 0;
	private static double dividendsReceived = 0;
	private static double amountOfMoneyToInvest = 0;
	private static double brokeragePercent = 0.2;
	
	public static void main(String[] args) {		
		calculateIncome();
	}
	
	public static void calculateIncome() {				
		for(int i = 1; i <= amountOfMonth; i++) {				
			if(i % 7 == 0) {
				salaryPerMonth += salaryIncrease;
				calculateIncomeLogic();
				continue;
			}			
			calculateIncomeLogic();
		}
		System.out.println("Amount of money in a bank account: " + totalSalary);
		System.out.println("Amount of money in a brokerage account: " + df.format(brokerageAccount));
		System.out.println("The total amount of money transferred to a brokerage account: " + amountOfMoneyInvested);
		System.out.println("Dividends received: " + df.format(dividendsReceived));
	}
	
	public static void calculateIncomeLogic() {		
		totalSalary += salaryPerMonth;
		amountOfMoneyToInvest = salaryPerMonth * investmentPercentage;
		amountOfMoneyInvested += amountOfMoneyToInvest;
		brokerageAccount += amountOfMoneyToInvest;
		dividends = brokerageAccount * brokeragePercent;
		dividendsReceived += dividends;
		brokerageAccount += dividends;
		totalSalary -= (amountOfMoneyToInvest + entertainment);
	}
}
