public class reverseThreeInterger {
    public static void main(String[] args) {
        
    int n = 234;
    StringBuilder sb = new StringBuilder();
    while(n !=0){
        int d= n %10;
        sb.append(d);
        n = n / 10;
    }
}
}