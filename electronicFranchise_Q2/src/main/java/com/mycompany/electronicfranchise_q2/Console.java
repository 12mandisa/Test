
package com.mycompany.electronicfranchise_q2;

abstract class Console implements IConsoles {
    protected String store;
    protected String consoleType;
    protected int totalSales;

    public Console(String store, String consoleType, int totalSales) {
        this.store = store;
        this.consoleType = consoleType;
        this.totalSales = totalSales;
    }

    @Override
    public String getStore() {
        return store;
    }

    @Override
    public String getConsoleType() {
        return consoleType;
    }

    @Override
    public int getTotalSales() {
        return totalSales;
    }
    
}
