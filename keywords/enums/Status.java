package keywords.enums;

public enum Status {

    Starting,Running,Processing,Failed
}
class Demo{
    public static void main(String[] args) {
        Status s = Status.Running;
        System.out.println(s);//Running

        Status[] ss = Status.values();
        for(Status status:ss){
            System.out.println(status+" : "+status.ordinal());
        }

        Status s1 = Status.Running;
        switch (s1) {
            case Starting:
                System.out.println("start");
                break;
        
            case Running:
                System.out.println("run");
                break;
            case Processing:
                System.out.println("wait for a while");
                break;
            default:
                 System.out.println("failed");
                break;
        }
    }
}

/**output      position
 * Starting   : 0
   Running    : 1
   Processing : 2
   Failed     : 3
 */