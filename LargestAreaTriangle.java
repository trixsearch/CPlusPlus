import java.util.Arrays;
public class LargestAreaTriangle {
    public static void main(String[] args) {
//        int[][] points = {{0, 0}, {0, 1}, {1, 0}, {0, 2}, {2, 0}};
//        int[][] points = {{1,0},{0,0},{0,1}};
        int[][] points={{4,6},{6,5},{3,1}};
        System.out.println(largestTriangleAreaSoulution(points));
    }

    static double largestTriangleAreaSoulution(int[][] points) {
        int largestSideOne = 0;
        int largestSideTwo = 0;
for (int i=0;i<points.length;i++){
    if(points[i][0]>largestSideOne){
        largestSideOne=points[i][0];
    }
    if(points[i][0]>largestSideTwo){
        largestSideTwo=points[i][0];
    }
}

        System.out.println(largestSideOne);
        System.out.println(largestSideTwo);
double answer = (largestSideOne*largestSideTwo)*0.5;
//        System.out.println("answer"+answer);
        return answer;
    }
}
