package news_Q4_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question4to7 {

	public static void main(String[] args) {

		List<News> news = new ArrayList<>();

		news.add(new News(1, "Vijay", "Surya", "comment"));
		news.add(new News(2, "Ajith", "Soori", "budget"));
		news.add(new News(1, "Karthi", "Vadivelu", "comment"));
		news.add(new News(3, "Kamal", "Surya", "budget"));
		news.add(new News(2, "Rajini", "Vadivelu", "comment"));
		news.add(new News(3, "Dhanush", "Surya", "budget"));
		news.add(new News(1, "Rahman", "Vivek", "comment"));

		maxComments(news);
		budgetCount(news);
		maxCommentsByUser(news);
		System.out.println("sorted order: Comments-Users: " + sortMaxCommentsByUser(news));
	}

	public static void maxComments(List<News> news) {
		List<News> news1 = news;
		List<News> list = new ArrayList<>();
		int max = 0;
		list = news.stream()
				.filter(news2 -> news1.stream().anyMatch(one -> one.getNewsId() == news2.getNewsId() && one != news2))
				.collect(Collectors.toCollection(ArrayList::new));

		System.out.println("list adter stream operation: ");
		for (News news3 : list) {
			System.out.println(news3);
		}

		System.out.println("-------------------------------------------------");

		Map<Integer, Integer> map = new HashMap<>();

		for (News news2 : list) {

			// checking if map already contains the news id
			if (map.containsKey(news2.getNewsId())) {

				// placing key -> newsId and value-> increments
				map.put(news2.getNewsId(), map.get(news2.getNewsId()) + 1);

			}
			// if key doesn't exist a new one is added with default value -> 1
			else {
				map.put(news2.getNewsId(), 1);
			}
		}

		System.out.println("map enteries: ");
		System.out.println("--------------");
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println("Key: " + entry.getKey() + "\tvalue: " + entry.getValue());
			if (max < (int) entry.getValue()) {
				max = (int) entry.getValue();
			}
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue().equals(max)) {
				System.out.println("id Maximum value: " + entry.getKey());
				break;
			}
		}
		System.out.println("-------------------------------------------------");
	}

	public static void budgetCount(List<News> news) {
		String budget = "budget";
		long budgtC = news.stream()
				// filtering objects based on "budget"
				.filter(p -> p.getComment().contains(budget))
				// incrementing count
				.count();
		System.out.println("budget count: " + budgtC);
		System.out.println("-------------------------------------------------");
	}

	public static void maxCommentsByUser(List<News> news) {
		List<News> news1 = news;
		List<News> list = new ArrayList<>();
		String id = "";
		int max = 0;

		list = news.stream()
				.filter(news2 -> news1.stream()
						.anyMatch(one -> one.getCommentByUser() == news2.getCommentByUser() && one != news2))
				.collect(Collectors.toCollection(ArrayList::new));

		Map<String, Integer> map = new HashMap<>();

		for (News news2 : list) {
			if (map.containsKey(news2.getCommentByUser())) {
				map.put(news2.getCommentByUser(), map.get(news2.getCommentByUser()) + 1);
			} else {
				map.put(news2.getCommentByUser(), 1);
			}
		}

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			// System.out.println("Key: " + entry.getKey() + "\tvalue: " +
			// entry.getValue());
			if (max < (int) entry.getValue()) {
				max = (int) entry.getValue();
				id = (String) entry.getKey();
			}
		}

		System.out.println("Maximum comment User: " + id);
		System.out.println("-------------------------------------------------");
	}

	public static Map<String, Integer> sortMaxCommentsByUser(List<News> news) {

		Map<String, Long> map1 = new HashMap<>();
		map1 = news.stream().collect(Collectors.groupingBy(News::getCommentByUser, Collectors.counting()));

		List<Map.Entry<String, Long>> list = new LinkedList<Map.Entry<String, Long>>(map1.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<String, Long>>() {
			public int compare(Map.Entry<String, Long> o1, Map.Entry<String, Long> o2) {
				return -(o1.getValue()).compareTo(o2.getValue());
			}
		});

		HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();

		for (Map.Entry<String, Long> aa : list) {
			temp.put(aa.getKey(), (int) (long) aa.getValue());
		}

		return temp;
	}
}