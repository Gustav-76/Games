package games.app.desktop.controllers.snake;

import games.app.desktop.controllers.MainController;
import games.app.desktop.views.snake.SnakeMainView;

/**
 *
 * @author Gustavo
 */
public class SnakeMainController {
    
    private MainController mainController;
    private SnakeMainView snakeMainView;
    
    public SnakeMainController(MainController mainController) {
        this.mainController = mainController;
        snakeMainView = new SnakeMainView(this);
    }

    public SnakeMainView getSnakeMainView() {
        return snakeMainView;
    }

}
