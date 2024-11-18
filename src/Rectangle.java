import java.util.Scanner;

public class Rectangle {
    private int hight, width;

    public Rectangle(int h, int w) {
        this.hight = h;
        this.width = w;
    }


    public void drawFilled() {
      drawFilled('*');
    }

    public void drawEmpty() {
        drawEmpty('*');
    }

    public void drawFilled(char x) {
        for (int i = 0; i < hight; i++) {
            for (int f = 0; f < width; f++) {
                System.out.print(x);
            }
            System.out.println(" ");
        }
    }

    public void drawEmpty(char x) {
        for (int i = 1; i <= hight; i++) {
            if (i == 1 || i == 7) {
                for (int f = 1; f <= width; f++) {
                    System.out.print(x);
                }
                System.out.println();
            } else {
                for (int f = 1; f <= width; f++) {
                    if (f == 1 || f == 4) {
                        System.out.print(x);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
    public void readRectFromConsole(){
        Scanner Rectangle = new Scanner(System.in);
        System.out.println("Please enter new Hight");
        this.hight=Rectangle.nextInt();
        System.out.println("Please enter new Width");
        this.width=Rectangle.nextInt();
    }
}