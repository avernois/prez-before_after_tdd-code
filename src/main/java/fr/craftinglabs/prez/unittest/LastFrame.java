package fr.craftinglabs.prez.unittest;

public class LastFrame extends Frame
{
    private static final int MAX_ROLLS = 3;

    @Override
    public boolean isOver() {
        return isStrike() && allRollsHaveBeenMade() ||
                !isStrike() && twoRollsHaveBeenMade();
    }

    @Override
    protected int maxRolls() {
        return MAX_ROLLS;
    }

    @Override
    int strikeBonusForPreviousFrame() {
        return firstRoll() + secondRoll();
    }

    @Override
    public int scoreWithBouns() {
        return firstRoll() + secondRoll() + thirdRoll();
    }

    private int thirdRoll() {
        return rolls[2];
    }
}
