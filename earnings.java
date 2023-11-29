public class earnings {
    public static void main(String[] args) {
        // Initialize earnings for two scenarios
        float r1=0.0F,r2 =0.0F;
        float mul = 0.1F;
        int count = 0;
        // Infinite loop
        while(true){
            count += 1;
            // Check if earnings from scenario 1 is greater than or equal to earnings from scenario 2

            if(r1>=r2){
                // Increment earnings for scenario 1 by $10 per hour
                r1 = r1+10;
                // Increment earnings for scenario 2 using the doubling rate
                r2 = r2+mul;
                // Double the multiplier for scenario 2
                mul = mul*2;
            }
            else{
                System.out.println(count-1+" hours");
                // Exit the loop
                break;
            }
        }
        }
    }
