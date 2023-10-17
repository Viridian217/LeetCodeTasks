package easy.tasks_701_to_800;

public class Task733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (color == image[sr][sc]){
            return image;
        }
        fillCheck(image,sr,sc,color,image[sr][sc]);
        return image;
    }
    public void fillCheck(int[][] image,int i, int j, int color, int imageValue){
        int lengthI = image.length;
        int lengthJ = image[i].length;
        if (i != 0 && image[i-1][j] == imageValue){
            int curr = image[i-1][j];
            image[i-1][j] = color;
            fillCheck(image,i-1,j,color,curr);
        }
        if (i != lengthI - 1 && image[i+1][j] == imageValue){
            int curr = image[i+1][j];
            image[i+1][j] = color;
            fillCheck(image,i+1,j,color,curr);
        }
        if (j != 0 && image[i][j - 1] == imageValue){
            int curr = image[i][j-1];
            image[i][j-1] = color;
            fillCheck(image,i,j-1,color,curr);
        }
        if (j != lengthJ - 1 && image[i][j + 1] == imageValue){
            int curr = image[i][j+1];
            image[i][j+1] = color;
            fillCheck(image,i,j+1,color,curr);
        }
        image[i][j] = color;
    }
}
