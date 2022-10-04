
import java.util.List;
import java.util.ArrayList;

public class NewsFeed {

    private List<News> listOfNews;

    public NewsFeed() {
        listOfNews = new ArrayList<News>();
    }

    public void addNews(final News news) {
        listOfNews.add(news);
    }

    public void removeNews(final News news) {
        listOfNews.remove(news);
    }

}
