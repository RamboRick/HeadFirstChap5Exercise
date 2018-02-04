package chap05;

public class Output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Output o =new Output();
		o.go();
	}
	
	

	 public void go() {
		// TODO Auto-generated method stub
		int y = 7;
		for ( int x = 1; x < 8; x ++){
			y++;
			if ( x > 4 ){
				System.out.println(++y + "");
			}
			if ( y > 14){
				System.out.println("x = " + x);
				break;
			}
		}
   }
}
	



	