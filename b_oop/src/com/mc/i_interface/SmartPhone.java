package com.mc.i_interface;

public class SmartPhone extends Computer implements BatteryDetachable, Communicatable{

	private String mobileAgency;
	
	public SmartPhone() {
		// TODO Auto-generated constructor stub
	}

	public SmartPhone(String brand, String pName, int price, String cpu, int ram, String mobileAgency) {
		super(brand, pName, price, cpu, ram);
		this.mobileAgency = mobileAgency;
	}

	public String getMobileAgency() {
		return mobileAgency;
	}

	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	
	public String toString() {
		return "SmartPhone [brand=" + brand + ", pName=" + pName + ", price=" + price + ", cpu=" + cpu + ", ram=" + ram
				+ ", mobileAgency=" + mobileAgency + "]";
	}
	
	@Override
	public void detachBattery() {
		System.out.println("배터리를 분리합니다.");	
	}

	@Override
	public void attachBattery() {
		System.out.println("배터리를 결합합니다.");	
	}

	@Override
	public void sendMessage() {
		System.out.println("메세지를 보냅니다.");		
	}

	@Override
	public void receiveMessage() {
		System.out.println("메세지를 받습니다.");		
	}
	
}
