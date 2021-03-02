package javalearning;

public class Mobile {
	
	long mobNumber = 1234567890L;
	
	String mColor = "Purple";
	
	double mobWeight = 1.5;	
	
	boolean isRefurbished = true;
	
	
	public void call() {
		
       System.out.println("Cal connected");
	}
	
	public void sendSms() {
		 
       System.out.println("Sent SMS");
	}
	
	public void takePhoto() {
		
      System.out.println("Took Photo");
	}

	public static void main(String[] args) {
		
		Mobile obj = new Mobile();
		
		obj.call();
		obj.sendSms();
		obj.takePhoto();
		
		System.out.println(obj.mobNumber);
		System.out.println(obj.mColor);
		System.out.println(obj.isRefurbished);
		System.out.println(obj.mobWeight);

	}

}
