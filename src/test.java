

public class test {

    public static int[] getKmpNext(String dest){
        int[] next = new int[dest.length()];
        next[0] = 0;
        for (int i = 1,j = 0;i < dest.length();i++){
            //当不相等时候
            if (dest.charAt(i) != dest.charAt(j)){
                //j回退直到找到相同的，或者j = 0
                while (dest.charAt(i) != dest.charAt(j) && j >0){
                    j = next[j - 1];
                }
                if (dest.charAt(i)==dest.charAt(j)){
                    next[i] = j+1;

                }
            }
        }
        return next;
    }
}
