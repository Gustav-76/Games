package games.app.desktop.controllers;

import games.app.desktop.views.GameListView;
import gustav.games.models.abstracts.AbstractGame;
import java.util.List;

/**
 * Class responsible of controlling GameListWiew.
 * @author Gustavo
 */
public class GameListController {
    
    private MainController mainController;
    private GameListView gameListView;
    
    /**
     * gameListView Getter.
     * @return an intance of the GameListView class related to GameListController.
     */
    public GameListView getGameListView() {
        return gameListView;
    }
    
    /**
     * Constructor of GameListController: creates an instance of the GameListView.
     */
    public GameListController(MainController mainController){
        this.mainController = mainController;
        gameListView = new GameListView(this);
    }
    
    /**
     * Loads the selected game.
     * @param selectedValue returned from the list of games in gameListView.
     */
    public void loadGame(Object selectedValue) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(selectedValue.equals("Snake")){
            mainController.getView(mainController.getSnakeMainView());
        }
    }

    public List<AbstractGame> getGameList() {
        return mainController.getGames();
    }
}
