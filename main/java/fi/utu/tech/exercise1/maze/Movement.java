package fi.utu.tech.exercise1.maze;

public class Movement {
    int x = 0, y = 0;

    public void move(String direction) {
        switch (direction) {
            case "stopped":
                break;
                case "right":
                    x += 1;
                    break;
                    case "down":
                        y += 1;
                        break;
                        case "left":
                            x -= 1;
                            break;
                            case "up":
                                y -= 1;
                                break;
        }
    }
    public String reverse(String direction) {
        return switch (direction) {
            case "stopped" -> "stopped";
            case "right" -> "left";
            case "down" -> "up";
            case "left" -> "right";
            case "up" -> "down";
            default -> "";
        };
    }

    public void testMove() {
        System.out.printf("(%d, %d)\n", x, y); // (0, 0)
        move("stopped");
        // TODO: movement: stopped

        System.out.printf("(%d, %d)\n", x, y); // (0, 0)
        move("right");
        // TODO: movement: right

        System.out.printf("(%d, %d)\n", x, y); // (1, 0)
        move("down");
        // TODO: movement: down

        System.out.printf("(%d, %d)\n", x, y); // (1, 1)
        move("left");
        // TODO: movement: left

        System.out.printf("(%d, %d)\n", x, y); // (0, 1)
        move("down");
        // TODO: movement: down
    }

    public void testReverse() {
        // TODO: reverse of left = right
        System.out.print(reverse("left"));
        // TODO: reverse of right = left
        reverse("right");
        // TODO: reverse of up = down
        reverse("up");
        // TODO: reverse of down = up
        reverse("down");
        // TODO: reverse of stopped = stopped
        reverse("stopped");
    }

    public static void main(String[] args) {
        Movement m = new Movement();
        m.testMove();
        m.testReverse();
    }
}
