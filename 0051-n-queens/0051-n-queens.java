class Solution {
     List<List<String>> ans= new ArrayList<>();
    public void helper(int row,int n,List<List<String>> ans,char board[][]){
       //base case
       if(row==n){
           List<String> temp=new ArrayList<>();
           for(int i=0;i<n;i++)
           {
              temp.add(new String (board[i]));
           }

           ans.add(temp);
       }

       //put queen in each row

       for(int col=0;col<n;col++){
          //if it is safe the put --> explore -->backtrack
          if(issafe(row ,col,n,board)){
            //put
            board[row][col]='Q';
            //explore
            helper(row+1,n,ans,board);
            //backtrack
            board[row][col]='.';
          }
       }
    }

    public boolean issafe(int row,int col,int n,char[][]board){
        //1. check same col

        for(int i=0;i<row;i++){
            if(board[i][col]=='Q') return false;
        }

        //2. check upper left diagonal

        int i=row-1;
        int j=col-1;
        while(i>=0 && j>=0)
         {
            if(board[i][j]=='Q') return false;
            i--;
            j--;
         }

         //3. check upper right diagonal

         i=row-1;
         j=col+1;
        while(i>=0 && j<n)
         {
            if(board[i][j]=='Q') return false;
            i--;
            j++;
         }

         return true;
    }



    public List<List<String>> solveNQueens(int n) {
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }

        helper(0,n,ans,board);

        return ans;
    }
}