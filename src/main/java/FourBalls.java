import processing.core.PApplet;

public class FourBalls extends PApplet {

    public static final int WIDTH = 648;
    public static final int HEIGHT = 488;
    public static final int DIAMETER = 10;
    int x1 = 0;
    int x2 = 0;
    int x3 = 0;
    int x4 = 0;
    int y1 = HEIGHT/5;
    int y2 = ( 2 * HEIGHT )/5;
    int y3 = ( 3 * HEIGHT )/5;
    int y4 = ( 4 * HEIGHT )/5;

    public static void main(String[] args) {
        PApplet.main("FourBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        paintBGWhite();
    }

    private void paintBGWhite() {
        background(255);
    }

    @Override
    public void draw() {
        drawBall1();
        drawBall2();
        drawBall3();
        drawBall4();
    }

    private void drawBall1() {
        ellipse(x1, y1, DIAMETER, DIAMETER );
        x1++;
    }

    private void drawBall2() {
        ellipse(x2, y2, DIAMETER, DIAMETER );
        x2+=2;
    }

    private void drawBall3() {
        ellipse(x3, y3, DIAMETER, DIAMETER );
        x3+=3;
    }

    private void drawBall4() {
        ellipse(x4, y4, DIAMETER, DIAMETER );
        x4+=4;
    }

}
