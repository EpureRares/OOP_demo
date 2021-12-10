package lab9.firstObserver;

import java.util.ArrayList;
import java.util.List;

interface Channel {
    void update(String name);
}
// observer
class NewsChannel implements Channel {
    private String latestNews;

    @Override
    public void update(String name) {
        latestNews = name;
    }

    public void getNews() {System.out.println(latestNews);}
}

// subject
class NewsAgency  {
    private List<Channel> channels = new ArrayList<>();

    public void addObserver(Channel channel) {
        this.channels.add(channel);
    }

    public void setNews(String news) {
        for (Channel channel: this.channels) {
            channel.update(news);
        }
    }
}


public class Observer {
    public static void main (String args[]) {
        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();

        observable.addObserver(observer);
        observable.setNews("Breaking news!");

        observer.getNews();
    }
}
