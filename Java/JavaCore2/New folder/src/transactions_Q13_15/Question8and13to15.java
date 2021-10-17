package transactions_Q13_15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import traders_Q9_12.Trader;

public class Question8and13to15 {

	public static void main(String[] args) {

		Transaction ts1 = new Transaction(new Trader("Krishna", "Bangalore"), 2021, 10000);
		Transaction ts2 = new Transaction(new Trader("Pavan", "Pune"), 2021, 5000);
		Transaction ts3 = new Transaction(new Trader("Yash", "Bangalore"), 2021, 7500);
		Transaction ts4 = new Transaction(new Trader("Virat", "Delhi"), 2011, 10000);
		Transaction ts5 = new Transaction(new Trader("Vijay", "Chennai"), 2010, 50000);
		Transaction ts6 = new Transaction(new Trader("Sameer", "Pune"), 2021, 2500);
		Transaction ts7 = new Transaction(new Trader("Gambhir", "Delhi"), 2011, 25000);
		Transaction ts8 = new Transaction(new Trader("Sehwag", "Delhi"), 2011, 30000);
		Transaction ts9 = new Transaction(new Trader("Suryakumar", "Indore"), 2019, 20000);

		List<Transaction> transactions = new ArrayList<>();

		transactions.add(ts1);
		transactions.add(ts2);
		transactions.add(ts3);
		transactions.add(ts4);
		transactions.add(ts5);
		transactions.add(ts6);
		transactions.add(ts7);
		transactions.add(ts8);
		transactions.add(ts9);

		System.out.println(sortTransactions(transactions));
		System.out.println(transaction3sValuesDelhi(transactions));
		System.out.println(highestTransaction2(transactions));
		System.out.println(smallestTransaction1(transactions));
	}

	public static List<Transaction> sortTransactions(List<Transaction> transactions) {
		List<Transaction> sortedTrans = new ArrayList<>();

		sortedTrans = transactions.stream().filter(p -> p.getYear() == 2011)
				.sorted(Comparator.comparingInt(Transaction::getValue))
				.collect(Collectors.toCollection(ArrayList::new));

		return sortedTrans;
	}

	public static List<Integer> transaction3sValuesDelhi(List<Transaction> transactions) {
		List<Integer> transactionValueDelhi = new ArrayList<>();

		transactions.stream().filter(p -> p.getTrader().getCity().equals("Delhi"))
				.forEach(p -> transactionValueDelhi.add(p.getValue()));

		System.out.println("------------------------------------------------------------------------------");
		return transactionValueDelhi;
	}

	public static int highestTransaction2(List<Transaction> transactions) {
		int max = Integer.MIN_VALUE;
		List<Integer> list = new ArrayList<>();

		transactions.stream().forEach(p -> list.add(p.getValue()));

		max = Collections.max(list);
		System.out.println("------------------------------------------------------------------------------");
		return max;
	}

	public static int smallestTransaction1(List<Transaction> transactions) {
		int min = Integer.MAX_VALUE;
		List<Integer> list = new ArrayList<>();

		transactions.stream().forEach(p -> list.add(p.getValue()));

		min = Collections.min(list);
		System.out.println("------------------------------------------------------------------------------");
		return min;
	}
}