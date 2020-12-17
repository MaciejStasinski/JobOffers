import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

//https://www.pracuj.pl/praca/java;kw/wroclaw;wp?rd=0
//  class="results-header__offer-count-text-number"
public class Main {
    public static void main(String[] args) {
        try {
            Document document = Jsoup.connect("https://www.pracuj.pl/praca/java;kw/wroclaw;wp?rd=0").get();
           Elements elements = document.getElementsByClass("results-header__offer-count-text-number");
            System.out.println("Liczba ofert pracy dla Java, Wrocław ze strony pracuj.pl: "+elements.get(0).text());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
