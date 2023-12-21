class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int max=0;
        int n=points.length;
      int arr[]=new int[n];
      for(int i=0; i<n; i++){
          arr[i]=points[i][0];
      } 
      Arrays.sort(arr);
      for(int j=0; j<n-1; j++){
          int diff=arr[j+1]-arr[j];
          max=Math.max(max,diff);
      }
      return max;
    }
}