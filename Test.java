public class Test extends Source{

    public static void main(String[] args){
        Source s = new Source();
        if(s.addNum(2, 2) == 4)
            System.out.println("Test Case Passed\n");
        if(s.addNum(3, 3) == 7)
            System.out.println("Test Case Failed\n");
        assert (s.addNum(2, 2) == 5);
    }
    

}