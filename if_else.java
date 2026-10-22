public class if_else {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        if(a>b){
            System.out.println("a is greater than b");
        }
        else if(b>c){
            System.out.println("b is greater than c");
        }
        else{
            System.out.println("c is greater than a and b");
        }

        // nested if else
        if(a>b){
            if(a>c){
                System.out.println("a is greater than b and c");
            }
            else{
                System.out.println("c is greater than a and b");
            }
        }
        else{
            if(b>c){
                System.out.println("b is greater than a and c");
            }
            else{
                System.out.println("c is greater than a and b");
            }
        }

        // dangling else problem
        int x = 10;
        int y = 20;
        if(x>y)
            if(x>0)
                System.out.println("x is greater than y and x is positive");
        else
            System.out.println("x is less than y and x is negative");
    }
}