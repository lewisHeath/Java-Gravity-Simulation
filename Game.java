class Game {
    public static void main(String[] args) {
        GameArena newGame = new GameArena(500, 500);
        //Ball newBall = new Ball(250, 250, 20, "BLUE", 2, 1);
        //move to the edge
        /*while(true){
            if(newBall.getXPosition() == newGame.getArenaWidth()){
                newBall.setXPosition(250);
            }
            newBall.setXPosition(newBall.getXPosition() + 1);
        } */
        //move all directions
        Ball[] balls = Ball.makeBalls(100);
        for(int i = 0; i < balls.length; i++){
            newGame.addBall(balls[i]);
        }
        while(true){
            for(int i = 0; i < balls.length; i++){
                balls[i].play(newGame);
            }
            newGame.pause();
        }

    }
}