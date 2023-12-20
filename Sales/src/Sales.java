import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Sale {
    private String name;
    private String service;
    private double amount;
    private String date;

    public Sale(String name, String service, double amount, String date) {
        this.name = name;
        this.service = service;
        this.amount = amount;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getService() {
        return service;
    }

    public double getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }
}
