package edu.cuny.brooklyn.cisc3120.project.game.model;

import java.util.LinkedList;
import java.util.List;

import edu.cuny.brooklyn.cisc3120.project.game.utils.I18n;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class GameStatistics {
    private int numOfTargetsShot;
    private int numOfShotsFired;
    private int numOfTargetsMade;
    private  int numOfRoundsWon;
    private int numOfRoundsPlayed;
    private double accuracy;
    
    public GameStatistics() {
        numOfTargetsShot = getNumOfTargetsShot();
        numOfShotsFired = getNumOfShotsFired();
        numOfTargetsMade = getNumOfTargetsMade();
        numOfRoundsWon = getNumofRoundsWon();
        numOfRoundsPlayed = getnumOfRoundsPlayed ();
        accuracy = getAccuracy() ;
    }

    public int getNumOfTargetsShot() {
        return numOfTargetsShot;
    }
    public void setNumOfRoundsWon (int numofRoundsWon) { // adds setter function for rounds won
    	this.numOfRoundsWon= numofRoundsWon;
    }
    public int getNumofRoundsWon () { // adds getter function for rounds won
    	return numOfRoundsWon;
    }
    public void setnumOfRoundsPlayed (int numOfRoundsPlayed) { // adds setter function for rounds played
    	this.numOfRoundsPlayed= numOfRoundsPlayed;
    }
    public int getnumOfRoundsPlayed () { // adds getter function for rounds won
    	return numOfRoundsPlayed;
    }
    
    public void setNumOfTargetsShot(int numOfTargetsShot) {
        this.numOfTargetsShot = numOfTargetsShot;
    }
    
    public int getNumOfShotsFired() {
        return numOfShotsFired;
    }

    public  void setNumOfShotsFired(int numOfShotsFired) {
       this.numOfShotsFired = numOfShotsFired;
    }

    public int getNumOfTargetsMade() {
        return numOfTargetsMade;
    }

    public void setNumOfTargetsMade(int numOfTargetsMade) {
        this.numOfTargetsMade = numOfTargetsMade;
    }

    public void updateAccuracy() {
        if (numOfShotsFired > 0) {
            accuracy = (double)(numOfTargetsShot) / (double)numOfShotsFired;
        } else {
            accuracy = 0.0;
        }
    }
    
    public double getAccuracy() {
        return accuracy;
    }

    public ObservableList<StatNameValue> toObservableList() {
        List<StatNameValue> listStatistics = new LinkedList<StatNameValue>();
        listStatistics.add(
                new StatNameValue(I18n.getBundle().getString("numOfTargetsShot")
                        , Integer.toString(numOfTargetsShot)));
        listStatistics.add(
                new StatNameValue(I18n.getBundle().getString("numOfShotsFired")
                        , Integer.toString(numOfShotsFired)));
        listStatistics.add(
                new StatNameValue(I18n.getBundle().getString("numOfTargetsMade")
                        , Integer.toString(numOfTargetsMade)));
        listStatistics.add(
                new StatNameValue(I18n.getBundle().getString("numOfRoundsWon")
                        , Integer.toString(numOfRoundsWon)));
        listStatistics.add(
                new StatNameValue(I18n.getBundle().getString("numOfRoundsPlayed")
                        , Integer.toString(numOfRoundsPlayed)));
        listStatistics.add(
                new StatNameValue(I18n.getBundle().getString("accuracy")
                        , String.format("%5.2f%%", accuracy)));
        return FXCollections.observableList(listStatistics);
    }
    
    public class StatNameValue {
        public final static String COLUMN_NAME_TITLE = "name";
        public final static String COLUMN_VALUE_TITLE = "value";
        
        private StringProperty name;
        private StringProperty value;
        
        public StatNameValue(String name, String value) {
            setName(name);
            setValue(value);
        }
        
        public void setName(String value) {
            nameProperty().set(value);
        }

        public String getName() {
            return nameProperty().get();
        }

        public StringProperty nameProperty() {
            if (name == null)
                name = new SimpleStringProperty(this, COLUMN_NAME_TITLE);
            return name;
        }



        public void setValue(String value) {
            valueProperty().set(value);
        }

        public String getValue() {
            return valueProperty().get();
        }

        public StringProperty valueProperty() {
            if (value == null)
                value = new SimpleStringProperty(this, COLUMN_VALUE_TITLE);
            return value;
        }
    }
}
