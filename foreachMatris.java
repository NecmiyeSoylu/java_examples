public class foreachMatris 
{
    public static void main(String[] Soylu)
    {
        int[][] aa=new int[][]{{1,2,3},{4,5,6}};
        for(int[] i:aa)
            for(int j:i)
                System.out.println(j);

                Test test = new Test();
                test.print();
    }    
}// maytis mantiğini biliyoruz. ilk boyuttaki her elaman bir dizi gibidir aa[0] üç elemanlı bir dizidir :)) 

class Test{

    void print(){
        System.out.println("test");
    }

}
