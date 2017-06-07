package com.affinity.rxjavapoc.model;

import com.affinity.rxjavapoc.service.YahooFinanceService;

public class StockInfo {
	
	public final String ticker;
	  public final double value;

	  public StockInfo(String theTicker, double theValue) {
	    ticker = theTicker;
	    value = theValue;
	  }

	  public static StockInfo fetch(final String ticker) {
	    return new StockInfo(ticker, YahooFinanceService.getPrice(ticker, true));
	  }

	  @Override
	  public String toString() {
	    return String.format("%s : %f", ticker, value);
	  }
	

}
