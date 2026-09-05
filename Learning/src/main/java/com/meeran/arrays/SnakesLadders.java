package com.meeran.arrays;

import java.util.ArrayList;

public class SnakesLadders {
    private ArrayList<Player> players = new ArrayList<>();
    private ArrayList<Ladder> laddAndSlop = new ArrayList<>();
    private boolean isPlay;

    public SnakesLadders() {
        laddAndSlop.add(new Ladder(2, 38));
        laddAndSlop.add(new Ladder(7, 14));
        laddAndSlop.add(new Ladder(8, 31));
        laddAndSlop.add(new Ladder(7, 14));
        laddAndSlop.add(new Ladder(8, 31));
        laddAndSlop.add(new Ladder(15, 26));
        laddAndSlop.add(new Ladder(21, 42));
        laddAndSlop.add(new Ladder(28, 84));
        laddAndSlop.add(new Ladder(36, 44));
        laddAndSlop.add(new Ladder(51, 67));
        laddAndSlop.add(new Ladder(71, 91));
        laddAndSlop.add(new Ladder(78, 98));
        laddAndSlop.add(new Ladder(87, 94));
        laddAndSlop.add(new Slope(16, 6));
        laddAndSlop.add(new Slope(46, 25));
        laddAndSlop.add(new Slope(49, 11));
        laddAndSlop.add(new Slope(62, 19));
        laddAndSlop.add(new Slope(64, 60));
        laddAndSlop.add(new Slope(74, 53));
        laddAndSlop.add(new Slope(89, 68));
        laddAndSlop.add(new Slope(92, 88));
        laddAndSlop.add(new Slope(95, 75));
        laddAndSlop.add(new Slope(99, 80));
        players.add(new Player(1, true));
        players.add(new Player(2));
        isPlay = false;
    }

    public static class Ladder {
        protected int startX, endX;
        public Ladder(int startX, int endX) {
            this.startX = startX;
            this.endX = endX;
        }
    }

    public static class Slope extends Ladder {
        public Slope(int startX, int endX) {
            super(startX, endX);
        }
    }

    public static class Player {
        private int id, x;
        private boolean isWinner, isCurrentTurn;
        public Player(int id) {
            this.id = id;
        }
        public Player(int id, boolean isCurrentTurn) {
            this.id = id;
            this.isCurrentTurn = isCurrentTurn;
        }
    }

    private String currentState(Player p) {
        if (p.x == 100 && !isPlay) {
            p.isWinner = true;
            isPlay = true;
            return String.format("Player %d Wins!", p.id);
        } else {
            if (isPlay) {
                return ("Game over!");
            }
            return String.format("Player %d is on square %d", p.id, p.x);
        }
    }

    private void checkPosition(Player p) {
        laddAndSlop.forEach(m -> {
            if (m.startX == p.x) {
                p.x = m.endX;
            }
        });
    }

    public String play(int die1, int die2) {
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).isCurrentTurn) {
                players.get(i).x += die1 + die2;

                if (players.get(i).x > 100) {
                    players.get(i).x = 100 - (players.get(i).x - 100);
                }

                checkPosition(players.get(i));

                if (die1 != die2) {
                    players.get(i).isCurrentTurn = false;

                    if (i != players.size() - 1) {
                        players.get(i + 1).isCurrentTurn = true;
                    } else {
                        players.get(0).isCurrentTurn = true;
                    }
                }
                return currentState(players.get(i));
            }
        }
        return null;
    }
}
