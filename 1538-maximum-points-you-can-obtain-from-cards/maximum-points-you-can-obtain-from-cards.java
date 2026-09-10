class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int count=0;
        int sum=0;
        int m;
        int n=cardPoints.length;
        
        int l=n-k;
        for(int i=0;i<l;i++)
        sum+=cardPoints[i];
        m=sum;
        
        for(int i=l;i<n;i++){
            sum+=cardPoints[i]-cardPoints[i-l];
            m=Math.min(sum,m);
        }
        int total=0;
        for(int i=0;i<n;i++){
        total+=cardPoints[i];
        }
        return total-m;

    }
}