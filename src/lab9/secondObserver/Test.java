package lab9.secondObserver;

import java.util.Observer;
import java.util.Observable;

class NewsChannel implements Observer {
    private String latestNews;


    @Override
    public void update(Observable o, Object arg) {
        latestNews = (String) arg;
    }

    public void getNews() {System.out.println(latestNews);}
}

class NewsAgency extends Observable {

    public void setNews(String news) {
        setChanged();
        notifyObservers(news);
    }
}

public class Test {
    public static void main (String args[]) {
        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();

        observable.addObserver(observer);
        observable.setNews("Breaking news!");

        observer.getNews();
    }
}
