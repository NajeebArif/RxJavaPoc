package com.affinity.rxjavapoc.server;

import java.util.List;

import com.affinity.rxjavapoc.model.StockInfo;

import rx.Observable;

public class StockServer {

	public StockServer() {
		// TODO Auto-generated constructor stub
	}
	
	 public static Observable<StockInfo> getFeed(List<String> symbols) {
		    return Observable.create(subscriber -> {
		      while(true) {
		        symbols.stream()
		            .map(StockInfo::fetch)
		            .forEach(subscriber::onNext);

		        sleep(1000);
		      }});
		  }

		  private static void sleep(int ms) {
		    try { Thread.sleep(ms); } catch(Exception ex) {}
		  }

}
