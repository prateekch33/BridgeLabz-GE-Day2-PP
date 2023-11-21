import java.util.*;

class Lines {
	int x1,x2,y1,y2;
	Lines(int a1,int b1,int a2,int b2) {
		x1=a1;
		x2=a2;
		y1=b1;
		y2=b2;
	}
	public double lengthOfLines() {
		double ans=Math.pow((x2-x1),2)+Math.pow((y2-y1),2);
		return Math.sqrt(ans);
	}
	public static void main(String[] args) {
		System.out.println("===Welcome to Comparison Computation Program===");
		Lines ob=new Lines(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]),Integer.parseInt(args[3]));
		System.out.printf("Length of line: %f\n",ob.lengthOfLines());
	}
}
