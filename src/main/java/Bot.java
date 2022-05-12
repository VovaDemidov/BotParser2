import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Bot {


    public static void parsing() {

        try {
            Document doc = Jsoup.connect ("https://5ka.ru/special_offers")
                    .get ( );
            Elements elements = doc.select ("img");
            for (Element e :
                    elements) {

                System.out.println (e);


            }

            Elements elements1 = doc.getElementsByClass ("item-name");


            for (Element e :
                    elements1) {

                System.out.println (e);

            }


        } catch (IOException e) {
            e.printStackTrace ( );
        }


    }


}
