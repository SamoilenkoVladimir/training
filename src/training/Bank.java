package training;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import credits.Businesses;
import credits.Individuals;
import credits.Loan;

public class Bank {

	public static void main(String[] args) {
		// Задание 1. Вариант -- 15 Кредиты. Сформировать набор предложений клиенту по целевым кредитам различных банков для оптимального выбора. Учитывать возможность досрочного погашения кредита и\или увеличения кредитной линии. Реализовать выбор и поиск кредита.
				
				//инициализация
				List<Loan> loans= new ArrayList <>();
				
				loans.add(new Individuals(1,"Belarusbank",10,true, true, true));
				loans.add(new Individuals(2,"Belarusbank",12,true, false, false));
				loans.add(new Businesses(3,"DevelopmentBank",11,true, true, true));
				loans.add(new Businesses(4,"Belarusbank",10,false, true, false));
				loans.add(new Businesses(5,"DevelopmentBank",60,true, false, true));
				loans.add(new Individuals(6,"Belarusbank",24,true, false, false));
				Scanner in = new Scanner(System.in);
				Integer num;
				
				//обработка консоли
				Boolean exit = false;
				while (!exit) {
				
				System.out.println("Набор предложений клиенту по кредитам банков:\n"
						+ "**************************************************************************************************************");
				//System.out.println(loans.toString());
				loans.stream().forEach(System.out::println);
				System.out.println("**************************************************************************************************************");
				System.out.println("Введите: 1-выбор кредита, 2-поиск кредитов, 0-выход");
				num=in.nextInt();
				if (num==0) {
					exit=true;
					System.out.println("Благодарим за внимание");}
				else if(num==1) {
					System.out.println("Введите: введите id кредита");
					num=in.nextInt();
					for (int i=loans.size()-1; i>=0;i--) {
						if(loans.get(i).getId()!=num) {
							loans.remove(i);				
						}
					}
					System.out.println("Выбранный кредит:");
					loans.stream().forEach(System.out::println);
					exit=true;
					System.out.println("Благодарим за внимание");
					num=-1;
				}
				else if(num==2) {
					System.out.println("Для поиска:\n -по наименованию банка введите 1\n -по срокам кредитов введите 2");
					num=in.nextInt();
					if (num==1) {
						System.out.println("Для поиска кредитов, \n предоставляемых ОАО'АСБ Беларусбанк'введите 1\n предоставляемых ОАО'Банк развития Республики Беларусь' введите 2");
						num=in.nextInt();
						if(num==1) {
							
							for (int i=loans.size()-1; i>=0;i--) {
							if(!loans.get(i).getBank().equals("Belarusbank")) {
								loans.remove(i);				
							}
							}
						}
						if(num==2) {
							
							for (int i=loans.size()-1; i>=0;i--) {
								if(!loans.get(i).getBank().equals("DevelopmentBank")) {
									loans.remove(i);				
								}
							}
						}
						num=-1;
					}
					if (num==2) {
						System.out.println("Для выбора кредитов: \n -краткосрочных введите 1\n -долгосрочных (свыше 12 месяцев) введите 2");
						num=in.nextInt();
						if(num==1) {
							
							for (int i=loans.size()-1; i>=0;i--) {
								if(loans.get(i).getTerm()>12) {
								loans.remove(i);				
							}
							}
						}
						if(num==2) {
							for (int i=loans.size()-1; i>=0;i--) {
								if(loans.get(i).getTerm()<=12) {
									loans.remove(i);				
								}
							}
						}
					}
				}
				num=-1;
				}
				in.close();
	}

}
