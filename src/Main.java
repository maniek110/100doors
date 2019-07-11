public class Main {

    public static void main(String[] args) {
        boolean[] doors=new boolean[100];
        //false - closed
        //true - open
        System.out.println(doors[0]);
        System.out.println(doors[9]);
        for(int i=1;i<doors.length;i++){
            for(int j=i;j<doors.length;j+=j){
                doors[j-1]=!doors[j-1];
            }
        }
        for(int i=0;i<doors.length;i++){
            System.out.println("Door nr "+(i+1)+": "+doors[i]);
        }
    }
}
