package ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class HttpServer {

	public static void main(String[] args) throws IOException {

		String urlString = "https://jsonplaceholder.typicode.com/todos/1";

		URL url = new URL(urlString);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");

		ToDos todos1 = new ToDos(10, 200, "study english", true);

		int responseCode = conn.getResponseCode();
		System.out.println("HTTP CODE : " + responseCode);

		BufferedReader brin = new BufferedReader(new InputStreamReader(conn.getInputStream()));

		String inputLine;
		StringBuffer responseBuffer = new StringBuffer();

		while ((inputLine = brin.readLine()) != null) {
			responseBuffer.append(inputLine);
		}

		brin.close();

		String[] strHtmls = responseBuffer.toString().split(",");
		System.out.println("index count : " + strHtmls.length);

		Gson gson = new Gson();
		String toDoStr = gson.toJson(strHtmls);
		ToDos todosObject = gson.fromJson(toDoStr, ToDos.class);
	}

}
