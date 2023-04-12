import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.net.URL;

public class Parser {
    private  String url;

    public Parser() {
        url = Config.url;
    }

    public static Document getPage() throws Exception {
        Parser parser = new Parser();
        Document page = Jsoup.parse(new URL(parser.url), 3000);
        return page;
    }
}



