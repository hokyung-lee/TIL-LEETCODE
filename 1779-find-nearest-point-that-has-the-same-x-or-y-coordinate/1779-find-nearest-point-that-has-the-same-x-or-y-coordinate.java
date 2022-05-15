class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int smallestDistance = -1;
        int position = -1;
        
        for (int i=0; i<points.length; i++) {
            int pointX = points[i][0];
            int pointY = points[i][1];
            
            if (x==pointX || y==pointY) {
                int distance = Math.abs(x-pointX) + Math.abs(y-pointY);
                if (smallestDistance == -1 || distance < smallestDistance) {
                    smallestDistance = distance;
                    position = i;
                }
            }
        }
        
        return position;
    }
}