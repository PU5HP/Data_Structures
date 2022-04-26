import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //input 
        int nr = sc.nextInt();
        int nc = sc.nextInt();
        //input array
        int [][]mat = new int [nr][nc];
        for(int i=0;i<nr;i++){
            for(int j=0;j<nc;j++){
                mat[i][j]=sc.nextInt();
            }
        }

        //logic
        int direction=0;
        int x=0;int y=0;
        int mx=0;int my=0;
        while(x<=nr-1 && y<=nc-1 && x>=0 && y>=0){
            mx=x;my=y;
            direction=(direction+mat[x][y])%4;
            if(direction==0){
                //mx=x;my=y;
                y=y+1;
            }
            else if(direction==1){
                //mx=x;my=y;
                x=x+1;

            }
            else if(direction==2){
                //mx=x;my=y;
                  y=y-1;
            }
            else{
                //mx=x;my=y;
                 x=x-1;
            }
        }


        //
        System.out.println(mx);
        System.out.println(my);
    }

}
