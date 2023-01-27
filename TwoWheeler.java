package week.day2;

public class TwoWheeler {
	public void noOfWheels () {
		int noOfWheels=2;
		System.out.println("NO OF WHEELS = " +noOfWheels);
	}
	public void noOfMirrors () {
		short noOfMirrors=2;
		System.out.println("NO OF MIRRORS = " + noOfMirrors);
	}
	public void chassisNumber () {
		long  chassisNumber=1407  ;
		System.out.println("CHASSISNUMBER = "+ chassisNumber);
	}
	public void isPunctured () {
		boolean isPunctured =false ;
		System.out.println("PUNCTURED = "+ isPunctured);
	}
	public void bikeName() {
		String bikeName="DIO";
		System.out.println("BIKE NAME = "+ bikeName);
	}
        Public void runningKm() {
                 double runningKm=1500;
                 System.out.println("RUNNING KM = "+runningKm);
        }
	
	
	public static void main(String[] args) {
		TwoWheeler specification =new TwoWheeler();
	    specification.noOfWheels();
	    specification.noOfMirrors();
	    specification.chassisNumber();
	    specification.isPunctured();
	    specification.bikeName();
            specification.runningKm();
	    }
}
