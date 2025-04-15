package com.packt.trading;

import com.packt.trading.dto.Stock;

public interface MarketWatcher {
   Stock getQuote(String symbol);
}
