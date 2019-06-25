package racingcar;

import java.util.Random;

public class RandomMoveStrategy implements  MoveStrategy {

    private static final int FORWARD_NUM = 4;
    private static final int MAX_BOUND = 10;

    @Override
    public boolean movable() {
        return (getRandomNo() >= FORWARD_NUM);
    }

    private int getRandomNo() {
        Random random = new Random();
        return random.nextInt(MAX_BOUND);
    }
}
