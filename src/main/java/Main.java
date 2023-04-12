import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import javax.lang.model.util.Elements;

public class Main {
    public static void main(String[] args) throws Exception {
        Parser parser = new Parser();
        Document page = parser.getPage();
        Element spanElement = page.select("div[class=tov_prew]").first();
        //System.out.println(spanElement);

        Element name = spanElement.select("strong").first();
        System.out.println(name.text());

        Element price = spanElement.select("div[class=price] b").first();
        System.out.println(price.text());   
    }
}
