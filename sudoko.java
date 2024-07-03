public class sudoko
{
    public  boolean helper (char[][] board,int row,int col)
    {
        //check karlo agr akri mai pahuch gaye to return kar do 
        if(row == board.length){
            return true;
        }
        // varna har sudoko kai 3x3 vale kai initial par jao 
        // agr col kai akri mai pahuvh jaoo toh nrow mai chale jao
        int nrow = 0;
        int ncol = 0;
        if(col1 == board.length-1){
            nrow =row+1;
        }
        else{
            nrow =row;
            ncol = col+1;
        }
        // agr board khali nahi hai recursive call karke
        if(board[row][col] != '.'){
            if(helper(board, nrow, ncol))
            {
               return true;
            }
            else
            {  // fill that space random no. from 0 to 9
                for(int i =1;i<=9;i++)
                {
                    if(isSafe(board ,row,col,i)) //check karo that sahi no. place kar rahe hei
                    {
                     board[row][col] = (char)(i+'0');
                     if(helper(board, nrow, ncol))
                     return true;
                     else
                     board[row][col] ='.';
                    }
                }

            }
            return false;
        }


    }


    public void solvesudoko(char[][] board)
    {
     helper(board,0,0);
    }
}