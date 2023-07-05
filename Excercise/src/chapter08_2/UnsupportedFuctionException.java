package chapter08_2;

public class UnsupportedFuctionException extends RuntimeException{
	private final int ERR_CODE;
	
//	public UnsupportedFuctionException() {
////		this.ERR_CODE = 100;
//		
//	}
	
	
	UnsupportedFuctionException(String msg){
		this(msg, 100);
	}
	
	public UnsupportedFuctionException(String msg, int code) {
		super(msg);
		ERR_CODE=code;
	}
	
	public int getErrorCode(){
		return ERR_CODE;
	}
	
	
	@Override
	public String getMessage() {
		
		return "[" +getErrorCode() +  "]" + super.getMessage();
	}
}
