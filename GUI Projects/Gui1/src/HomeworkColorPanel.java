//Gary Magill
//Checkerboard Project
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
//import java.awt.*;
import javax.swing.JComponent;
public class HomeworkColorPanel extends JComponent{
    @Override
    public void paintComponent(Graphics g) {
        drawBoard(g);
        drawPieces(g);
    }
    public void drawPieces(Graphics g) {
        int count = 1;
        for(int cY1 = 0; cY1 < 210; cY1 += 70){
            if(count % 2 == 0 ){
                for(int cX2 = 70; cX2 <= 510; cX2 += 140){
                    g.setColor(Color.red);
                    g.fillOval(cX2 + 15, cY1 + 15, 40, 40);
                }
            }else{
                for(int cX1 = 0; cX1 <= 510; cX1 += 140){
                    g.setColor(Color.red);
                    g.fillOval(cX1 + 15, cY1 + 15, 40, 40);
                }
            }
            count++;
        }
        int count2 = 2; 
        for(int cY1 = 370; cY1 < 550; cY1 += 70){
            if(count2 % 2 == 0 ){
                for(int cX2 = 70; cX2 <= 510; cX2 += 140){
                    g.setColor(Color.orange);
                    g.fillOval(cX2 + 15, cY1 - 5, 40, 40);
                }
            }else{
                for(int cX1 = 0; cX1 <= 510; cX1 += 140){
                    g.setColor(Color.orange);
                    g.fillOval(cX1 + 15, cY1 - 5, 40, 40);
                }
            }
            count2++;
        }
    }
    public void drawBoard(Graphics g){
        int r1 = 0;
        int r2 = 255;
        int tempR;
        Graphics2D graphicsObj = (Graphics2D)g;
        //the max on the for loop makes it only run 8 times. if i set it to the window size it printed 10 squares 
        for(int y1 = 0; y1 <= 510; y1 += 70){ // this makes the squares go to the next row goes up by 70 because the squares are 70x70
            for(int x1 = 0; x1 <=510; x1 += 140){ // this sets the x cord for the first color and following colors in the row increments by 140 because i manually add 70 to the other color
                    //this prints the black square
                    Rectangle filledRec = new Rectangle(x1, y1, 70,70); 
                    Color fillColor = new Color(r1, r1, r1);   //RGB Color  
                    graphicsObj.setColor(fillColor);
                    graphicsObj.fill(filledRec);
                    //prints the white square
                    Rectangle filledRec2 = new Rectangle(x1 + 70, y1, 70,70); 
                    Color fillColor2 = new Color(r2, r2, r2);   //RGB Color  
                    graphicsObj.setColor(fillColor2);
                    graphicsObj.fill(filledRec2);
            }
            //switches the colors every row
            tempR = r1;
            r1 = r2;
            r2 = tempR;
        }
    }
    /*
   @Override
   public void paintComponent(Graphics g) {
        
        int r1 = 0;
        int r2 = 255;
        int tempR;
        Graphics2D graphicsObj = (Graphics2D)g;
        //the max on the for loop makes it only run 8 times. if i set it to the window size it printed 10 squares 
        for(int y1 = 0; y1 <= 510; y1 += 70){ // this makes the squares go to the next row goes up by 70 because the squares are 70x70
            for(int x1 = 0; x1 <=510; x1 += 140){ // this sets the x cord for the first color and following colors in the row increments by 140 because i manually add 70 to the other color
                    //this prints the black square
                    Rectangle filledRec = new Rectangle(x1, y1, 70,70); 
                    Color fillColor = new Color(r1, r1, r1);   //RGB Color  
                    graphicsObj.setColor(fillColor);
                    graphicsObj.fill(filledRec);
                    //prints the white square
                    Rectangle filledRec2 = new Rectangle(x1 + 70, y1, 70,70); 
                    Color fillColor2 = new Color(r2, r2, r2);   //RGB Color  
                    graphicsObj.setColor(fillColor2);
                    graphicsObj.fill(filledRec2);
            }
            //switches the colors every row
            tempR = r1;
            r1 = r2;
            r2 = tempR;
        }
        CheckerPieces piece = new CheckerPieces();
*/

        //starts with the piece coding
        
/* 
        int[][] grid = {{0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0}};
        
        int count = 1; 
        int row;
        int col = 0;
        int count4 = 1;
        for(int cY1 = 0; cY1 < 210; cY1 += 70){
            if(count % 2 == 0 ){
                for(int cX2 = 70; cX2 <= 510; cX2 += 140){
                    row = 2;
                    g.setColor(Color.red);
                    g.fillOval(cX2 + 15, cY1 + 15, 40, 40);
                    System.out.println(row + " " + col);
                    grid[row - 1][col] = 1;
                }
            }else{
                for(int cX1 = 0; cX1 <= 510; cX1 += 140){
                    if(count4 == 3){
                        row = 3;
                    }else{
                        row = 1;
                    }
                    g.setColor(Color.GREEN);
                    g.fillOval(cX1 + 15, cY1 + 15, 40, 40);
                    grid[row - 1][col] = 1;
                    col += 2;
                    count4++;
                }
            }
            count++;
            col++;
        }
        int count2 = 2; 
        int count3 = 1;
        for(int cY1 = 370; cY1 < 550; cY1 += 70){
            if(count2 % 2 == 0 ){
                col = 1;
                for(int cX2 = 70; cX2 <= 510; cX2 += 140){
                    if(count3 == 3){
                        row = 8;
                    }else{
                        row = 6;
                    }
                    g.setColor(Color.orange);
                    g.fillOval(cX2 + 15, cY1 - 5, 40, 40);
                    grid[row - 1][col - 1] = 1;
                    row += 2;
                    count3++;
                }
            }else{
                col = 1;
                for(int cX1 = 0; cX1 <= 510; cX1 += 140){
                    row = 7;
                    g.setColor(Color.cyan);
                    g.fillOval(cX1 + 15, cY1 - 5, 40, 40);
                    grid[row - 1][col - 1] = 1;
                    col += 2;
                }
            }
            count2++;
        }
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                System.out.print(grid[i][j]);
            }
                System.out.println(" ");
        }*/
}
