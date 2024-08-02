import java.awt.Robot;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.Rectangle;
import java.util.Random;

public class MouseJiggler {
public static void main(String[] args) throws Exception {
Robot robot = new Robot();
Random rand = new Random();
int screenWidth = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
int screenHeight = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();


while (true) {
int x = rand.nextInt(screenWidth);
int y = rand.nextInt(screenHeight);
robot.mouseMove(x, y);
Thread.sleep(60000);
}
}
}