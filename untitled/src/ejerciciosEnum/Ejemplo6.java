package ejerciciosEnum;

import java.io.Closeable;
import java.io.IOException;

public class Ejemplo6 {
    public enum ThreadStatesEnum implements Closeable{
      START(1){
          @Override
          public void close() throws IOException {

          }

          @Override
                  public String toString(){
              return "START implementation.Priority=" + getPriority();
            }

            @Override
          public  String getDetail(){
              return "START";
            }
        },
        WAITING(3){
            @Override
            public void close() throws IOException {

            }

            @Override
public String getDetail(){
    return "WAITING";
}
        },
        DEAD(4){
            @Override
            public void close() throws IOException {

            }

            @Override
            public String getDetail(){
              return "DEAD";
          }
      };
      private int priority;

      public abstract String getDetail();
      private ThreadStatesEnum(int i){
          priority =i;
      }

        public int getPriority() {
            return this.priority;
        }

        public void setPriority(int p) {
            this.priority = p;
        }
        @Override
        public String toString(){
          return "Default ThreadStatesConstructors implementation.Priority="+ getPriority();
        }

        @Override
        public void close()throws IOException{
            System.out.println("Close of Enum");
        }
    }

    class Main{
        public static void main(String[] args) {
            ThreadStatesEnum tse =ThreadStatesEnum.DEAD;
            tse.setPriority(2);
            System.out.println(tse.toString());
            System.out.println(tse.getDetail());
        }
    }


}
