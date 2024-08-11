class Solution {

  public int[][] floodFill(int[][] image, int sr, int sc, int color) {
    // set the target // this case is 1
    int target = image[sr][sc];
    // if the target is alreay correct color then dont flood fill
    if (target == color)  return image; 
    // start flood fill 
    fill(image, sr, sc, target, color);
    return image;
  }

  public void fill(int[][] image, int sr, int sc, int target, int color) {
    int rowLength = image.length;
    int colLength = image[0].length;
    // handle not the case
    if (sr < 0 || sc < 0 || sr >= rowLength || sc >= colLength || image[sr][sc] != target) {
      return;
    }

    // change the target to new color
    image[sr][sc] = color;
    // change the adjacent index (4 directional)
    fill(image, sr + 1, sc, target, color);
    fill(image, sr - 1, sc, target, color);
    fill(image, sr, sc + 1, target, color);
    fill(image, sr, sc - 1, target, color);
  }
}