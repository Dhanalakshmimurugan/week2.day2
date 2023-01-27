package week.day2;

public class MobileSpecification {
	public static void  mobile () {
		String mobileBrandName="ONEPLUS 9R";
		char mobileLogo='1';
		short noOfMobilePiece=3000;
		int modelNumber= 1404;
		double mobileImeiNumber= 14041422;
		float mobilePrice =40000f;
		boolean isDamaged=false;
		
				System.out.println("MOBILENAME = "+mobileBrandName);
				System.out.println("MOBILELOGO = "+mobileLogo);
				System.out.println("MODELNUMBER = "+modelNumber);
				System.out.println("MOBILEIMEINUMBER = "+mobileImeiNumber);
				System.out.println("PRICE = "+mobilePrice);
				System.out.println("ISDAMAGED = "+isDamaged);
		}
	public static void main(String[] args) {
	  MobileSpecification details =new MobileSpecification();
	  details.mobile();
	 
	         
	}

}
