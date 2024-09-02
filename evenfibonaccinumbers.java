public class evenfibonaccinumbers {
    public static void main(String[] args) {
        int n1=1, n2=2, n3, i, count=32, temp=0, tempEven=0;
        System.out.println(n1+" "+n2);
        for(i=2; i<count; i++) {
            n3=n1+n2;    
            System.out.print(" "+n3);
            temp=n3;
            if (temp%2==0) {
                tempEven+=temp;
            }
            n1=n2;
            n2=n3;
        }
        System.out.println("\n"+tempEven);
    }
}