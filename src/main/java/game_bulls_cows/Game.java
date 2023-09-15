package game_bulls_cows;


public interface Game {
    void start(Integer sizeWord, Integer maxTry, Logger logger);

    Answer inputValue(String value);

    GameStatus getGameStatus();

    void restart(Integer sizeWord, Integer maxTry);
}