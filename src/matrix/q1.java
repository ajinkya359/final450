package matrix;

import java.util.ArrayList;

public class q1 {
    static ArrayList<Integer> spirallyTraverse(int[][] matrix, int r, int c) { ArrayList<Integer> ans=new ArrayList<>();

        ArrayList<Integer> ans =new ArrayList<>();
        if(c==0||r==0) return ans;
        int current_row=0, current_column=c-1;
        while(current_row<r/2)
        {
            for(int i=c-current_column-1;i<=current_column;i++)
                ans.add(matrix[current_row][i]);
            for(int i=current_row+1;i<r-current_row-2;i++)
                ans.add(matrix[i][current_column]);
            for(int i=current_column-1;i>=c-current_column-1;i--)
                ans.add(matrix[r-current_row-2][i]);
            for(int i=r-current_row-2;i>current_row&&i>=0;i--)
            ans.add(matrix[i][c-current_column-1]);
            current_row++;
            current_column--;
        }




        return ans;
    }
}
