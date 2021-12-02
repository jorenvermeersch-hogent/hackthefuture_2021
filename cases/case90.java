package cases;

public class case90 {
    public static void main(String[] args) {
        int s=0, n=69, lengte=String.valueOf(n).length();
		while(n>0){
			s += Math.pow(n % 10,lengte);
			n /= 10;
			lengte--;
		}
		if(n==s){
			System.out.println("Y");
		}
		else{
			System.out.print("N");			
		}
    }
}
