package andersen.test.task;

public class Main {
    public static void main(String[] args) {
        NumberAlg numberAlg = new NumberAlg();
        NumberAlg.sendNumber();

        NameAlg nameAlg = new NameAlg();
        nameAlg.sendName();

        //int[] List = {6, 8, 15, 24, 30};
        ArrayAlg arrayAlg = new ArrayAlg();
        arrayAlg.getArray();
    }
}
