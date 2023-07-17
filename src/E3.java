public class E3 {
    private  int result;
    public E3(){
        result = 1;
    }
    public int seriesMultiplication(int heighestValue){
        for(int loopCount = 1; loopCount <= heighestValue; loopCount = loopCount + 1){
            result = result * loopCount;
        }
        return result;
    }
}
