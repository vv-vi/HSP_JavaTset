package Recursion;

public class MiGong {
    public static void main(String[] args) {
        int[][] map = new int[8][7];

        //将第一行和最后一行变1
        for (int i = 0; i < 7; i++){
                map[0][i] = 1;
                map[7][i] = 1;
        }
        //将第一列和最后一列变1
        for (int i = 0; i < 7; i++){
            map[i][0] = 1;
            map[i][6] = 1;
        }
        //障碍坐标
        map[3][1] = 1;
        map[3][2] = 1;

        System.out.println("==========迷宫地图==========");
        for (int[] ints : map) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }

        TestB b = new TestB();
        b.findWay(map,1,1);

        System.out.println("=========迷宫地图路线=========");
        for (int[] ints : map) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }

    }
}

class TestB{
    public boolean findWay(int[][] map,int i,int j){
        //如果在6，5这个位置说明是出口
        if (map[6][5] == 2){
            return true;
        }else {
            //当前这个位置0，说明可以走
            if (map[i][j] == 0){
                //假定可以走通
                map[i][j] = 2;
                if(findWay(map,i + 1,j)){
                    return true;
                }else if (findWay(map,i,j + 1)){
                    return true;
                }else if (findWay(map,i - 1,j)){
                    return true;
                }else if (findWay(map,i,j - 1)){
                    return true;
                }else {
                    map[i][j] = 3;
                    return false;
                }
            }else {
                //map[i][j] = 1,2,3
                return false;
            }
        }


    }
}
