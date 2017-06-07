package com.spiders;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class SpidersTest {

	public static int DAY = 1;

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<List<String>> data = new ArrayList<>();

		for (; DAY <= 10; DAY++) {
			String content = HttpClientUtil.requestByGetMethod("https://papi.mama.cn/wap/yr_todayeat/share_52.php?mode=2&days="
			        + DAY + "&rel=1");
			Document document = Jsoup.parse(content);
			Elements eleList = document.select(".list").select("li");
			List<String> when = new ArrayList<String>();
			List<String> what = new ArrayList<String>();

			int i = 0;
			String dayContent = "";
			for (Element item : eleList) {
				dayContent += item.text();
				i++;
			}
			data.addAll(getData(getTitle(), when, what));
		}

		ExcelUtils.writeExcel("D:/test.xls", getTitle().toArray(new String[3]), null);

	}

	private static List<String> getTitle() {
		List<String> title = new ArrayList<>();
		title.add("天数");
		title.add("食材");
		return title;
	}

	private static List<List<String>> getData(List<String> title, List<String> when, List<String> what) {
		List<List<String>> data = new ArrayList<List<String>>();
		for (int row = 0; row < when.size(); row++) {
			for (int col = 0; col < title.size(); col++) {
				List<String> colObj = new ArrayList<String>();
				if (col == 0) {
					colObj.add("");
				}
				if (col == 1) {
					colObj.add(when.get(col));
				}
				data.add(colObj);
			}
		}
		return data;
	}
}
