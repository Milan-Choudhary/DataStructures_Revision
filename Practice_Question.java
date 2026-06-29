
public class Practice_Question {
    public static void main(String[] args){
        /*
        Pattern asked in Optimus Information first visiting round
        _ _ _ *
        _ _ * *
        _ * * *
        * * * *
        
        */


        for(int i = 3; i >= 0; i--){

            for(int j = 0; j < 4; j++){

                if(j >= i){
                    System.out.print("*"); //Try adding the space like print("*" + " "), It will lead you to a pyramidal printing
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.println();

        }



    }
}
