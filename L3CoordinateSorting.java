import java.util.Arrays;

class Point implements Comparable<Point>{
    int x;
    int y ;
    Point(int x, int y){
        this.x= x;
        this.y= y;
    }
    public int compareTo(Point P){
        return this.x - P.x;
    }
}
public class L3CoordinateSorting {
    public static void main(String[] args) {
        Point arr[] ={new Point(10, 12), new Point(3,14), new Point(24,3)};

        Arrays.sort(arr);
        for(int i=  0;i< arr.length; i++ ){
            System.out.println(arr[i].x + " "+ arr[i].y);
        }
    }
}
