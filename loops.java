import java.util.Scanner;
public class loops {
    public static void main(String[] args) {

        /** 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int originalN = n; // Store the original value of n for later use
        int reverse = 0;

        //while loop
        while(originalN>0){
            int dig = originalN%10;
            reverse = reverse*10 + dig;
            originalN = originalN/10;

        }
        System.out.println("Reverse of the number is: " + reverse);*/

        //do while loop
        int sum = 0;
        do{
            
            System.out.print(sum);// it execute atleast one when condition is false also
        }while(sum>0);

        //for loop (traditional)
        int[] nums ={1,2,3,4,5,6};
        for(int i=0;i<nums.length-1;i++){
            System.out.println(nums[i]);
        }

        //for loop with multiple initializtion and updating

        for(int a=0,b=0;a<nums.length-1 && b<nums.length-1;a++,b++){
            System.out.println(a+""+""+b);
        }

        //for with omiting 

        /*for(;;){
            System.out.print("running"); infinite loop
        }*/

        int val = 1;

        for (; val <= 3; ) {
            System.out.println(val);
            val++;
        }

        // for each loop
        System.out.println("for each loop");
        int[] number ={1,2,3,4,5,6,7,8,9};

        for(int no : number){
            System.out.print(no);
        }

        // limitaions : use only need values not for index

        
    }
}
