class Game {
    public static void main(String[] args) {
        GameArena arena = new GameArena(500, 500);
        Ball ball = new Ball(250, 250, 10, "WHITE", 50);
        arena.addBall(ball);
        while(true){
            ball.play(arena);
            arena.pause();
        }
    }
}