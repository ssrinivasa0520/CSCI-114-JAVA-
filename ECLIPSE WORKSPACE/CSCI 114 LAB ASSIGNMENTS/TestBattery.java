class TestBattery {

	public static void main(String[] args) {
	       Battery b1 = new Battery(2500);
	       b1.drain(1000);
	       System.out.println("Remaining Capacity: "+b1.getRemainingCapacity());
	       b1.charge();
	       System.out.println("Capacity after charge: "+b1.getRemainingCapacity());      
	   }
}
