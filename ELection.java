import java.util.*;
class hide {
    int count[]={0,0,0,0,0,0};
    Scanner in = new Scanner(System.in);
    
    
    int read(){
        System.out.print("Cast vote: ");
        int vote = in.nextInt();
        return(vote);
    }
    void counter(){
        System.out.println("Enter total number of voters: ");
        int total = in.nextInt();
        for(int i=0;i<total;i++){
            int n = read();
            switch(n){
                case 1 : count[1] = count[1]+1;
                        break;
                case 2 : count[2] = count[2]+1;
                        break;
                case 3 : count[3] = count[3]+1;
                        break;
                case 4 : count[4] = count[4]+1;
                        break;
                case 5 : count[5] = count[5]+1;
                        break;
                default: count[0] = count[0]+1;
                        break;
            }
        }
    }
    void display(){
        for(int i=1;i<6;i++){
            System.out.println("Candidate"+i+"\t");
            System.out.println(" "+count[i]);
        }
        System.out.println("Spoit ballots :"+count[0]);
    }
}
class Election{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        hide x = new hide();
        x.counter();
        x.display();
    }
}