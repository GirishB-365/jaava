public class task3 {
   

    public static boolean isHarshadNumber(int n) {
            if (n <= 0) return false; 
    
            int original = n;
            int digitSum = 0;
    
            while (n > 0) {
                digitSum += n % 10;
                n /= 10;
            }
    
            return original % digitSum == 0;
        }
    
        public static void main(String[] args) {
            System.out.println(isHarshadNumber(12));  
        
        }
    }
    

