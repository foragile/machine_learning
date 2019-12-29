import java.util.*;

public class TextRank {
    /*阻尼系数*/
    private double d = 0.85;

    private int maxIter = 500;
    private double stopDiff = 0.1;

    /*文档数*/
    private int D = -1;

    /*input*/
    List<List<String>> docs = new ArrayList<>();

    /*output*/
    private Map<Double, Integer> scores = new TreeMap<Double, Integer>(Collections.reverseOrder());

    /*nxn转移矩阵*/
    private double[][] weight;

    /*1xn转移矩阵*/
    private double[] weight_cbind;

    /*收敛值*/
    private double[] res;

    BM25 bm25;

    public TextRank(List<List<String>> docs) {
        this.docs = docs;
        bm25 = new BM25(docs);
        D = docs.size();
        weight = new double[D][D];
        weight_cbind = new double[D];
        res = new double[D];
    }
}
