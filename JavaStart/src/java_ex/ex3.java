package java_ex;

public class ex3 {

	public static void main(String[] args) {
		
		checkID check = new checkID();
		String sign;
		try {
			sign = check.checkResult("hong");
			System.out.println(sign);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
class checkID{
	
	public String checkResult(String b) throws Exception{
		
		String call = "";
		if(b.equals(null) || b.equals("")) {
			System.out.println("잘못된 접근입니다.");
		}
		else {
			if(b.equals("hong")) {
				call = "no";
			}
			else {
				call = "yes";
			}
		}
		return call;
	}
}
