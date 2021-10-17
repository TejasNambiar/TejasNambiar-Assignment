package httpGetRequest;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Arrays;
import java.util.List;

public class HttpGetRequest {

	public static <T> void main(String[] args) throws IOException, InterruptedException {
		String url = "https://httpbin.org/get";
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).GET().version(Version.HTTP_2).build();

		HttpClient client = HttpClient.newBuilder().build();
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		List<String> stringList = Arrays.asList(response.headers().toString().split(","));

		stringList.stream().forEach(System.out::println);
		System.out.println("-----------------------------------------------------");
		System.out.println(response.statusCode());
		System.out.println("-----------------------------------------------------");
		System.out.println(response.body());
	}

}
