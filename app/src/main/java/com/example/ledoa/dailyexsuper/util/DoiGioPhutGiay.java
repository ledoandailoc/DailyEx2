package com.example.ledoa.dailyexsuper.util;

public class DoiGioPhutGiay {
	public DoiGioPhutGiay() {
		// TODO Auto-generated constructor stub
	}
	public static String GiaySangPhut(long Giay){
		//long giay = Giay;
		long phut = Giay/60;
		long giay = Giay%60;
		long gio  = phut/60;
		if (Giay < 60 ) {
			return giay + " Giây";
		}
		/*else {
		    if (phut < 60) {*/
		    	if (giay == 0) {
					return phut + " Phút " ;
		    	}
				return phut + " Phút " + giay + " Giây";
		    	
			/*} else {
				phut = phut%60;
				
				return gio + " Giờ " + phut + " Phút " + giay + " Giây";
			}
		}*/
		    
	}
	public static String GiaySangGio(long Giay){
		//long giay = Giay;
		long phut = Giay/60;
		long giay = Giay%60;
		long gio  = phut/60;
		if (Giay < 60 ) {
			return giay + " Giây";
		}
		else {
		    if (phut < 60) {
		    	if (giay == 0) {
					return phut + " Phút " ;
		    	}
				return phut + " Phút " + giay + " Giây";
		    	
			} else {
				phut = phut%60;
				
				return gio + " Giờ " + phut + " Phút " + giay + " Giây";
			}
		}
		    
	}
}

