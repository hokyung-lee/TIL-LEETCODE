class Solution {
    public double average(int[] salary) {
        long sum = 0;
        int max = salary[0];
        int min = salary[0];
        int salaryCount = salary.length;
        for (int i=0; i < salaryCount; i++) {
            if (salary[i] > max) max = salary[i];
            if (salary[i] < min) min = salary[i];
            sum += salary[i];
        }
        sum = sum - max - min;
        
        double result = (double)sum/(salaryCount-2);
        
        return result;
    }
}