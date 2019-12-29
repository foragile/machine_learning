import java.io.Serializable;

/**
 * Created by slade on 2019/12/29.
 */
public class Tree<T> implements Serializable {
    private static final long serialVersionUID = -5487863835892446060L;
    private static final int MAX_SIZE = 65500;

    /*多组数据*/
    public Tree<T>[] branches;

    /*单组数据*/
    Tree<T> branch = null;

    private double rate = 0.9;
    private char c;

    /*statue状态*/
    private byte statue = 1;

    /*词典参数*/
    private T param = null;

    public Tree() {
    }

    public Tree(double rate) {
        branches = new Tree[MAX_SIZE];
        this.rate = rate;
    }

    public Tree(char c) {
        this.c = c;
    }

    public Tree(T param, char c, byte statue) {
        this.param = param;
        this.c = c;
        this.statue = (byte) statue;
    }
}
