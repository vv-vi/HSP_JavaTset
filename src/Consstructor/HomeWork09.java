package Consstructor;

public class HomeWork09 {
    public static void main(String[] args) {
        Music music = new Music("开阔天空",10);
        music.play();
        String info = music.getInfo();
        System.out.println(info);
    }
}

class Music{
    String name;
    int times;

    public Music(String name,int times){
        this.name = name;
        this.times = times;
    }

    public void play(){
        //这里面的name不需要this是因为局部变量没有同名的属性
        System.out.println("音乐" + name + "真正播放中。。。时长为" + times + "秒");
    }

    public String getInfo(){
        return "音乐" + name + "真正播放中。。。时长为" + times + "秒";
    }

}
