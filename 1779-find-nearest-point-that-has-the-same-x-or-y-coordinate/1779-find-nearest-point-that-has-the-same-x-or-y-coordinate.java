class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int smallestDistance = Integer.MAX_VALUE;
        int position = -1;
        
        for (int i=0; i<points.length; i++) {
            int pointX = points[i][0];
            int pointY = points[i][1];
            
            if (x==pointX || y==pointY) {
                int distance = Math.abs(x-pointX) + Math.abs(y-pointY);
                if (distance < smallestDistance) {
                    smallestDistance = distance;
                    position = i;
                }
            }
        }
        
        return position;
    }
}