package array;

/**
 * @Author czgggggggg
 * @Date 2021/8/24
 * @Description
 */
public class Array463 {
    public static void main(String[] args) {
        int[][] grid1 = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}}; //16
        int[][] grid2 = {{1}};//4
        int[][] grid3 = {{1,0}};//4
        int[][] grid4 = {{1},{1},{1},{0}};//8
        System.out.println(islandPerimeter(grid1));
        System.out.println(islandPerimeter(grid2));
        System.out.println(islandPerimeter(grid3));
        System.out.println(islandPerimeter(grid4));
    }
    public static int islandPerimeter(int[][] grid) {
        int islandPerimeter = 0;
        int i_length = grid.length;
        int j_length = grid[0].length;
        if(i_length == 1 || j_length == 1){
            if(i_length == 1 && j_length == 1){
                if(grid[0][0] == 1)
                    islandPerimeter += 4;
            }
            else if(i_length == 1 && j_length != 1){
                for(int j = 0; j < j_length; j++){
                    if(grid[0][j] == 1){
                        if(j == 0){
                            islandPerimeter += 3;
                            if(grid[0][j + 1] == 0)
                                islandPerimeter++;
                        }
                        if(j == j_length - 1){
                            islandPerimeter += 3;
                            if(grid[0][j - 1] == 0)
                                islandPerimeter++;
                        }
                        if(j > 0 && j < j_length - 1){
                            islandPerimeter += 2;
                            if(grid[0][j - 1] == 0)
                                islandPerimeter++;
                            if(grid[0][j + 1] == 0)
                                islandPerimeter++;
                        }
                    }
                }
            }else if(i_length != 1 && j_length == 1){
                for(int i = 0; i < i_length; i++){
                    if(grid[i][0] == 1){
                        if(i == 0){
                            islandPerimeter += 3;
                            if(grid[i + 1][0] == 0)
                                islandPerimeter++;
                        }
                        if(i == i_length - 1){
                            islandPerimeter += 3;
                            if(grid[i - 1][0] == 0)
                                islandPerimeter++;
                        }
                        if(i > 0 && i < i_length - 1){
                            islandPerimeter += 2;
                            if(grid[i - 1][0] == 0)
                                islandPerimeter++;
                            if(grid[i + 1][0] == 0)
                                islandPerimeter++;
                        }
                    }
                }
            }
        }else{
            for(int i = 0; i < i_length; i++){
                for(int j = 0; j < j_length; j++){
                    if(i == 0 || i == i_length - 1 || j == 0 || j == j_length - 1){//边界情况
                        if(grid[i][j] == 1){
                            //4个顶点的处理
                            if(i == 0 && j == 0){
                                islandPerimeter += 2;
                                if(j + 1 < j_length){
                                    if(grid[0][j + 1] == 0)
                                        islandPerimeter++;
                                }
                                if(i + 1 < i_length){
                                    if(grid[i + 1][0] == 0)
                                        islandPerimeter++;
                                }
                            }
                            if(i == 0 && j == j_length - 1){
                                islandPerimeter += 2;
                                if(j - 1 >= 0){
                                    if(grid[i][j - 1] == 0)
                                        islandPerimeter++;
                                }
                                if(i + 1 < i_length){
                                    if(grid[i + 1][j] == 0)
                                        islandPerimeter++;
                                }
                            }
                            if(i == i_length - 1 && j == 0){
                                islandPerimeter += 2;
                                if(i - 1 >= 0){
                                    if(grid[i - 1][j] == 0)
                                        islandPerimeter++;
                                }
                                if(j + 1 < j_length){
                                    if(grid[i][j + 1] == 0)
                                        islandPerimeter++;
                                }
                            }
                            if(i == i_length - 1 && j == j_length - 1){
                                islandPerimeter += 2;
                                if(i - 1 >= 0){
                                    if(grid[i - 1][j] == 0)
                                        islandPerimeter++;
                                }
                                if(j - 1 >= 0){
                                    if(grid[i][j - 1] == 0)
                                        islandPerimeter++;
                                }
                            }
                            //除了顶点的4条边界的处理
                            if(i == 0 && j > 0 && j < j_length - 1){
                                islandPerimeter++;
                                if(grid[i][j - 1] == 0)
                                    islandPerimeter++;
                                if(grid[i][j + 1] == 0)
                                    islandPerimeter++;
                                if(grid[i + 1][j] == 0)
                                    islandPerimeter++;
                            }
                            if(i == i_length - 1 && j > 0 && j < j_length - 1){
                                islandPerimeter++;
                                if(grid[i][j - 1] == 0)
                                    islandPerimeter++;
                                if(grid[i][j + 1] == 0)
                                    islandPerimeter++;
                                if(grid[i - 1][j] == 0)
                                    islandPerimeter++;
                            }
                            if(j == 0 && i > 0 && i < i_length - 1){
                                islandPerimeter++;
                                if(grid[i - 1][j] == 0)
                                    islandPerimeter++;
                                if(grid[i + 1][j] == 0)
                                    islandPerimeter++;
                                if(grid[i][j + 1] == 0)
                                    islandPerimeter++;
                            }
                            if(j == j_length - 1 && i > 0 && i < i_length - 1){
                                islandPerimeter++;
                                if(grid[i - 1][j] == 0)
                                    islandPerimeter++;
                                if(grid[i + 1][j] == 0)
                                    islandPerimeter++;
                                if(grid[i][j - 1] == 0)
                                    islandPerimeter++;
                            }
                        }
                    }
                    else{//非边界情况的处理
                        if(grid[i][j] == 1){
                            if(grid[i - 1][j] == 0)//上
                                islandPerimeter++;
                            if(grid[i][j + 1] == 0)//右
                                islandPerimeter++;
                            if(grid[i + 1][j] == 0)//下
                                islandPerimeter++;
                            if(grid[i][j - 1] == 0)//左
                                islandPerimeter++;
                        }
                    }
                }
            }
        }
        return islandPerimeter;
    }
}
//grid = [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]  //16
//[[0,1,0,0],
// [1,1,1,0],
// [0,1,0,0],
// [1,1,0,0]]

//grid = [[1]]  //4
//grid = [[1,0]] //4