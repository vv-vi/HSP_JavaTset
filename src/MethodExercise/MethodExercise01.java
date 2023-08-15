package MethodExercise;

public class MethodExercise01 {
    public static void main(String[] args) {
        AA aa = new AA();
        boolean odd = aa.isOdd(78);
        if (odd == true){
            System.out.println("是奇数");
        }else {
            System.out.println("是偶数");
        }



        aa.print(4,4,'#');

    }
}

class AA{
    public boolean isOdd(int num){
        return num % 2 != 0;
    }

    public void print(int row,int col,char c){
       for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.print(c);
            }
           System.out.println();
        }
    }
}