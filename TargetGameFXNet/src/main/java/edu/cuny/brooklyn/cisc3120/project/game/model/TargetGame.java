package edu.cuny.brooklyn.cisc3120.project.game.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.cuny.brooklyn.cisc3120.project.game.controller.GameController;

public class TargetGame {
    private static Logger LOGGER = LoggerFactory.getLogger(TargetGame.class);
    
    private final static int GAME_TARGET_AREA_WIDTH = 40;
    private final static int GAME_TARGET_AREA_HEIGHT = 40;
    private final static char TARGET_INDICATOR_ON_BOARD = 'X';
    
    private boolean gameStateChanged;
    
    private File theGameFile;
    private Target target;
    private GameBoard gameBoard;
    private Random rng;
    
    private GameStatistics gameStatistics;

    public TargetGame() {
        gameStateChanged = false;
        gameBoard = new GameBoard(GAME_TARGET_AREA_HEIGHT, GAME_TARGET_AREA_WIDTH);
        rng = new Random();
        target = null;
        gameStatistics = new GameStatistics();
    }
    
    public boolean isGameStateChanged() {
        return gameStateChanged;
    }

    public void setGameStateChanged(boolean gameStateChanged) {
        this.gameStateChanged = gameStateChanged;
    }

    public void saveTheGame() throws FileNotFoundException, IOException {
        FileOutputStream fos = null; 
        theGameFile = null; 
        theGameFile = new File ("config.properties");
        fos = new FileOutputStream(theGameFile);
        Properties PropConfig = new Properties ();
        PropConfig.setProperty("numOfTargetsShot",Integer.toString(gameStatistics.getNumOfTargetsShot())); // saves game statistics
        PropConfig.setProperty("numOfShotsFired",Integer.toString(gameStatistics.getNumOfShotsFired()));
        PropConfig.setProperty("numOfTargetsMade",Integer.toString(gameStatistics.getNumOfTargetsMade()));
        PropConfig.setProperty("numOfRoundsWon",Integer.toString(gameStatistics.getNumofRoundsWon()));
        PropConfig.setProperty("numOfRoundsPlayed",Integer.toString(gameStatistics.getnumOfRoundsPlayed()));
        PropConfig.setProperty("maxGuess",Integer.toString(GameController.maxGuess));
        PropConfig.store(fos, null);
       
        fos.close();
    }

    public File getTheGameFile() {
        return theGameFile;
    }

    public GameBoard getGameBoard() {
        return gameBoard;
    }

    public Target getTarget() {
        return target;
    }
    
    public void setNewTarget() {
        target = getRandomTarget();
        addTargetToBoard(target);
    }

    private Target getRandomTarget() {
        int x = rng.nextInt(GAME_TARGET_AREA_WIDTH);
        int y = rng.nextInt(GAME_TARGET_AREA_HEIGHT);
        Target target = new Target(x, y);
        LOGGER.debug("Target: " + x + "," + y);
        return target;
    }

    private void addTargetToBoard(Target target) {
        gameBoard.setCell(target.getX(), target.getY(), TARGET_INDICATOR_ON_BOARD);
    }

    public GameStatistics getGameStatistics() {
        return gameStatistics;
    }    
}
