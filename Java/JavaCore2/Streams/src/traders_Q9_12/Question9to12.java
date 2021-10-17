package traders_Q9_12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Question9to12 {

	public static void main(String[] args) {

		List<Trader> traders = new ArrayList<>();

		traders.add(new Trader("Krishna", "Bangalore"));
		traders.add(new Trader("Pavan", "Pune"));
		traders.add(new Trader("Yash", "Bangalore"));
		traders.add(new Trader("Virat", "Delhi"));
		traders.add(new Trader("Vijay", "Chennai"));
		traders.add(new Trader("Sameer", "Pune"));
		traders.add(new Trader("Gambhir", "Delhi"));
		traders.add(new Trader("Sehwag", "Delhi"));
		traders.add(new Trader("Suryakumar", "Indore"));

		printUniqueCities(traders);
		trader2sFromPuneSortByName(traders);
		System.out.println("All traders in Alphabetic order");
		System.out.println(allTrader3Names(traders));
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("All workers that work in 'Indore': ");
		areAnyTrader4sFromIndore(traders).forEach(System.out::println);
		;
	}

	public static void printUniqueCities(List<Trader> traders) {
		Set<String> list = new TreeSet<>();

		traders.stream().filter(p -> list.add(p.getCity())).distinct().collect(Collectors.toCollection(ArrayList::new));

		System.out.println("All unique cities workers work in: ");
		list.forEach(System.out::println);
		System.out.println("-----------------------------------------------------------------------------");

	}

	public static void trader2sFromPuneSortByName(List<Trader> traders) {
		List<String> uniqueList = new ArrayList<>();

		traders.stream().filter(p -> p.getCity().equals("Pune")).sorted(Comparator.comparing(Trader::getName))
				.collect(Collectors.toList()).forEach(p -> uniqueList.add(p.getName()));

		System.out.println("All workers that work in 'Pune': ");
		uniqueList.forEach(System.out::println);
		System.out.println("-----------------------------------------------------------------------------");
	}

	public static String allTrader3Names(List<Trader> traders) {
		String allTrader = "";
		ArrayList<Trader> arrayList = new ArrayList<>();

		arrayList = traders.stream().sorted(Comparator.comparing(Trader::getName))
				.collect(Collectors.toCollection(ArrayList::new));

		for (Trader trader : arrayList) {
			allTrader = allTrader + trader.getName() + " ";
		}

		return allTrader;
	}

	public static List<Trader> areAnyTrader4sFromIndore(List<Trader> traders) {
		List<Trader> traders1 = traders;
		List<Trader> traders2 = new ArrayList<>();

		traders2 = traders1.stream().filter(p -> p.getCity().equals("Indore"))
				.collect(Collectors.toCollection(ArrayList::new));

		return traders2;
	}
}