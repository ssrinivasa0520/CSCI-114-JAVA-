class Battery {

    private double initialCapacity; //variable to hold the initial capacity of battery
    private double remainingCapacity; //variable to hold the value of remaining capacity of battery

    public Battery(double capacity) {
        this.initialCapacity = capacity; //initializing value for initial capacity of battery
        remainingCapacity = capacity; //initializing value for remaining capacity of battery
    }

    public void drain(double amount) {
        remainingCapacity -= amount;
        if (remainingCapacity < 0)
            remainingCapacity = 0;
    }

    public void charge() {
        remainingCapacity = initialCapacity;
    }

    public double getRemainingCapacity() {
        return remainingCapacity;
    }
}