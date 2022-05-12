//link : https://www.hackerrank.com/challenges/migratory-birds/problem

class Result {

    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(int []arr) {
    // Write your code here
    HashMap<Integer,Integer> hm = new HashMap<>();
    for(int i=0;i<arr.length;i++){
        int c = arr[i];
        if(hm.containsKey(c))
         hm.put(c,hm.get(c)+1);
        else
         hm.put(c,1);
    }
    int max = arr[0];
    for(Integer e : hm.keySet()){
        if(hm.get(e)>hm.get(max))
         max = e;
    }
    return max;
    }

}
