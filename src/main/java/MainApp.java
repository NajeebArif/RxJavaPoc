import java.util.Arrays;
import java.util.List;

import com.affinity.rxjavapoc.model.StockInfo;
import com.affinity.rxjavapoc.server.StockServer;

import rx.Observable;

public class MainApp {

	public MainApp() {}

	public static void main(String[] args) {
		List<String> symbols = Arrays.asList("AMZN", "GOOG", "ORCL");
		Observable<StockInfo> feed = StockServer.getFeed(symbols);
		feed.subscribe(System.out::println);
	}

}
