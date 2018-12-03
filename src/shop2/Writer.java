package shop2;

public interface Writer {

    /**
     * Start writing bill
     */
    void start();


    /**
     * Add new line to the bill
     *
     * @param line line to add
     */
    void writeLine(String line);

    /**
     * Stop writing bill
     */
    void stop();
}
