package Method;

public class Method02 {
    public static void main(String[] args) {

        int [][]map = {{1,2,3},{3,2,1},{4,5,6}};

        MyTool tool = new MyTool();
        tool.printArr(map);
        tool.printArr(map);
        tool.printArr(map);

    }
}
class MyTool{
    public void printArr(int[][] map){
        System.out.println("============");
        for (int i = 0; i < map.length; i++){
            for (int j = 0; j < map[i].length; j++){
                System.out.print(map[i][j]+"\t");
            }
            System.out.println();
        }
    }
}