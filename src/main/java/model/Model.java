package model;

import org.deeplearning4j.rl4j.space.Encodable;

import java.util.Arrays;

/**
 * Created by T on 28-11-2017.
 */
public class Model implements Encodable {

    public int[] values;

    public int[] potentialMoves;
    public int score;
    public boolean win = false;
    public boolean lose = false;

    public Model(int size) {
        this.values = new int[size * size];
        this.score = 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.values);
    }

    @Override
    public double[] toArray() {
        // TODO: implement method
        return new double[0];
    }
}