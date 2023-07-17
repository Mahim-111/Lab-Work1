public class E2 {

    private  int result;

    public E2(){
        result = 0;
    }

    public int seriesSummation(int heighestValue){
        for(int loopCount = 1; loopCount <= heighestValue; loopCount = loopCount + 1){
            result = result + loopCount;
        }
        return result;
    }
}
