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
	public double lineLength(int a1,int b1,int a2,int b2) {
                double ans=Math.pow((a2-a1),2)+Math.pow((b2-b1),2);
                return Math.sqrt(ans);
        }
	public static void main(String[] args) {
		System.out.println("===Welcome to Comparison Computation Program===");
		Lines ob=new Lines(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]),Integer.parseInt(args[3]));
		System.out.printf("Length of line: %f\n",ob.lengthOfLines());
		System.out.println("Enter another line:");
		Scanner input=new Scanner(System.in);
		int x1=input.nextInt();
		int y1=input.nextInt();
		int x2=input.nextInt();
		int y2=input.nextInt();
		System.out.printf("Length of both the lines is preferrable?: %b",ob.lengthOfLines()==ob.lineLength(x1,y1,x2,y2));
	}
}
