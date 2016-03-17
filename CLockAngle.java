package commonQuestions;

public class CLockAngle {
	
	public static void main(String[] args){
		
		int hour = 0;
		int mins = 0;
		try{
			hour = 7 ;//Integer.parseInt(args[0]);
			mins = 0;//Integer.parseInt(args[1]);
			
		}catch(Exception e){
				System.err.println(e.getMessage());				
			}	
		float angle = calAngle(hour, mins);
		System.out.println(angle);
	}

	private static float calAngle(int hour, int mins) {
		float mAngle = (mins*6);
		float hAngle = (hour*30)+(mins/12);
		System.out.println(hAngle);
		System.out.println(mAngle);
		return (Math.abs(mAngle - hAngle) >= 180) ? (Math.abs(mAngle - hAngle)-180): Math.abs(mAngle - hAngle);
	}
	
}