package commonQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("rawtypes")
public abstract class polarAngle implements Comparator{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Point> pointList = new ArrayList<Point>();
	
		for(int i=0; i<n; i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			Point p = new Point(x,y);
			pointList.add(p);		
		}
		
		Collections.sort(pointList, new Comparator<Point>() {

			public int compare(Point p1, Point p2){
				double angle1 = calDegree(p1);
				double angle2 = calDegree(p2);
				System.out.println(angle1);
				System.out.println(angle2);
				System.out.println("--------------");
				if(angle1 > angle2){
					return 1;					
				}else if(angle2 > angle1){
					return -1;				
				}else if(angle1 == angle2){
					float hyp1 = (float) Math.sqrt((p1.getY()*p1.getY())+(p1.getX()*p1.getX()));
					float hyp2 = (float) Math.sqrt((p2.getY()*p2.getY())+(p2.getX()*p2.getX()));
					if(hyp1 > hyp2){
						return 1;
					}else{
						return -1;
					}				
				}else{
					return 0;
				}
			}
		});	
		
		printArr(pointList);
	}
	
	public static double calDegree(Point p){
		double angle = 0;
		if(p.getX() < 0 && p.getY() < 0){
			angle = 270 - Math.abs((Math.toDegrees(Math.atan2(p.getY(), p.getX()))));
		} else if(p.getX() < 0){
			angle = 180 - Math.abs((Math.toDegrees(Math.atan2(p.getY(), p.getX()))));
		} else if(p.getY() < 0){
			angle = 360 - Math.abs((Math.toDegrees(Math.atan2(p.getY(), p.getX()))));
			
		} else{
			angle = Math.abs((Math.toDegrees(Math.atan2(p.getY(), p.getX()))));
		}
			return angle;
	}
	
		public static void printArr(ArrayList<Point> pointList){
			Iterator itr = pointList.iterator();
			while(itr.hasNext()){ 
				Object element = itr.next();
				System.out.println(element.toString());
			}
				
		}
	}


class Point{
	private int x;
	private int y;
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int  getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public void setY(int y){
		this.y = y;
	}
	
	@Override
	public String toString(){
		String s = (this.getX()+" "+this.getY());
		return s;			
	}
}
