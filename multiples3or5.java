public class multiples3or5{
    public static void main(String []args){
        int i;
        int multiple3 = 0;
        int multiple5 = 0;
        for (i=0; i<1000; i++) {
            if (i%3==0) {
                System.out.println(i);
                multiple3+=i;
            } else if (i%5==0) {
                System.out.println(i);
                multiple5+=i;
            }
        }
        System.out.println("Total multiple3: "+multiple3);
        System.out.println("Total multiple5: "+multiple5);
        
        int total = multiple3+multiple5;
        System.out.println("Total: "+total);
    }
}