package assignments;

public class QueensAttack {
    static int QueenAttack(int X, int Y, int P, int Q) {
        if (X == P || Y == Q || Math.abs(X - P) == Math.abs(Y - Q)) {
            return 1;
        } else {
            return 0;
        }
    }
}
