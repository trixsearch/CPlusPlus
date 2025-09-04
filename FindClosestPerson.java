// 3516. Find Closest Person LeetCode

// class FindClosestPerson {
//     public int findClosest(int x, int y, int z) {
//         int xka= Math.abs(z-x);
//         int yka= Math.abs(z-y);
//         int ans=0;
//         if(xka>yka) return ans=2;
//         if(xka<yka) return ans=1;
//     return ans;
//     }
// }

// you can also do the same without the Math class which is the best example 

class FindClosestPerson {
    public int findClosest(int x, int y, int z) {
        int xka= (z-x);
        if(xka<0){xka=xka*-1;}
        int yka= (z-y);
        if(yka<0){yka=yka*-1;}
        if(xka==yka) return 0;
        if(xka>yka) return 2;
        else return 1;
    }
}
