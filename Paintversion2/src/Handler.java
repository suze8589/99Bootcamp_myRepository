import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Handler implements KeyboardHandler {

    public Keyboard keyboard;
    public Player player;
    public Grid grid;


    public Handler(Player player, Grid grid) {
        this.player = player;
        this.grid = grid;
        keyboard = new Keyboard(this);
        createKeyboardEvents();
    }

    public void createKeyboardEvents() {
        KeyboardEvent keyboardEventRight = new KeyboardEvent();
        keyboardEventRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboardEventRight.setKey(KeyboardEvent.KEY_RIGHT);
        keyboard.addEventListener(keyboardEventRight);

        KeyboardEvent keyboardEventLeft = new KeyboardEvent();
        keyboardEventLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboardEventLeft.setKey(KeyboardEvent.KEY_LEFT);
        keyboard.addEventListener(keyboardEventLeft);

        KeyboardEvent keyboardEventUp = new KeyboardEvent();
        keyboardEventUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboardEventUp.setKey(KeyboardEvent.KEY_UP);
        keyboard.addEventListener(keyboardEventUp);


        KeyboardEvent keyboardEventDown = new KeyboardEvent();
        keyboardEventDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboardEventDown.setKey(KeyboardEvent.KEY_DOWN);
        keyboard.addEventListener(keyboardEventDown);

        KeyboardEvent keyboardEventSpace = new KeyboardEvent();
        keyboardEventSpace.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboardEventSpace.setKey(KeyboardEvent.KEY_SPACE);
        keyboard.addEventListener(keyboardEventSpace);

        //int cellX = player.getPlayer().getX();
        //int cellY = player.getPlayer().getY();
        //int cellSize = grid.getCellSize();
        //int row = (cellX - 10) / cellSize;
        // col = (cellY - 10) / cellSize;
        //grid.paintCell(row, col, player.getPlayer().getColor());
        //break;
        //
    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_RIGHT:
                player.moveRight();
                break;

                case KeyboardEvent.KEY_LEFT:
                    player.moveLeft();
                    break;

                    case KeyboardEvent.KEY_UP:
                    player.moveUp();
                    break;

                        case KeyboardEvent.KEY_DOWN:
                        player.moveDown();
                        break;

                        case KeyboardEvent.KEY_SPACE:
                            //int col = (player.getX() - 10) / grid.getCellSize();
                            //int row = (player.getY() - 10) / grid.getCellSize();
                            grid.isPainted(grid.getCols(), grid.getRows());
                            //player.isPainted(); //using this I can fill the rectangle
                            //System.exit(1);
                        break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
