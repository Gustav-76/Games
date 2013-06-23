package games.app.desktop.controllers;

import games.app.desktop.controllers.snake.*;
import games.app.desktop.models.Game;
import games.app.desktop.models.snake.SnakeGame;
import games.app.desktop.views.GameListView;
import games.app.desktop.views.MainFrame;
import games.app.desktop.views.snake.SnakeMainView;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase responsible of controlling MainFrame.
 * @author Gustavo M.
 */
public class MainController {
    
    private MainFrame mainFrame;
    private GameListController gameListController;
    private SnakeMainController snakeMainController;
    
    private List<Game> games = new ArrayList<Game>();

    public List<Game> getGames() {
        return games;
    }
    
    /**
     * MainController constructor
     */
    public MainController(){
        //Games
        games.add(new SnakeGame());
        
        //Controllers
        gameListController = new GameListController(this);
        snakeMainController = new SnakeMainController(this);
        
        
        //Last and Main one!
        mainFrame = new MainFrame(this);    //Has to be the last one because it needs the other controllers/views to be ready!
    }
    
    /**************************/
    /*** Controller methods ***/
    /**************************/
    
    /**
     * Closes the desktop application
     */
    public void close(){
        mainFrame.dispose();
        this.close();
    }
    
    /**
     * Method that uses CardLayout to get the view required in <code>view</code>.
     * @param view JPanel view.
     */
    public <T> void getView(T view) {
        CardLayout cardLayout = (CardLayout) mainFrame.getMainPanel().getLayout();
        cardLayout.show(mainFrame.getMainPanel(), view.getClass().getSimpleName().toString());
        
        if(view.getClass().getSimpleName().equals("GameListView")){
            gameListController.getGameListView().getListofGames().requestFocusInWindow();
        }
    }
    /**
     * gameListView Getter.
     * @return an intance of the GameListView class related to GameListController.
     */
    public GameListView getGameListView() {
        return gameListController.getGameListView();
    }
    
    /**
     * MAIN METHOD
     * @param args 
     */
    public static void main(String[] args){
        MainController mainController =  new MainController();
    }

    public SnakeMainView getSnakeMainView() {
        return snakeMainController.getSnakeMainView();
    }
}
