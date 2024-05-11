class Solution
{
    //Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int matrix[][], int n) 
    { 
        // code here
        for(int i =0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                int temp =matrix[i][j];
                matrix [i][j] = matrix [j][i];
                matrix [j][i]=temp;
            }
        }
        for(int i =0;i<n;i++) {
            int l =0;
            int h=n-1;
            while(l<h){
                int temp = matrix[l][i];
                matrix[l][i] = matrix[h][i];
                matrix[h][i] = temp;
                l++;
                h--;
            }
        }
    }
}
