

public class Main {

     private String name;
     private String id;
     private int score;
     Main(String name, String id, int score){
         if(score < 0 || score > 100){
             this.score = 0;
         } else {
             this.score = score;
         }
         this.id = id;
         this.name = name;
     }
     void setScore(int s){
         if(s < 0 || s > 100){
             System.out.println("score input error");
             this.score = 0;

         } else {
             this.score = s;
         }
     }

    @Override
    public String toString() {
        return
                "name='" + name +
                ", id='" + id +
                ", score=" + score;
    }
}


