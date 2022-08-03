package alienspacedating;

public class Player {

    public int charm;
    public int coin;

    public Player(int charm, int coin) {
        this.charm = charm;
        this.coin = coin;
    }

    public int getCharm() {
        return charm;
    }

    public void setCharm(int charm) {
        this.charm = charm;
    }

    public int getCoin() {
        return this.coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public void randomCoin() { //the random num is between 100-1000
        int max = 1000;
        int min = 100;
        int randomCoin = (int)Math.floor(Math.random()*(max-min+1)+min);
        this.coin = randomCoin; //coin equals randomCoin
    }


}
