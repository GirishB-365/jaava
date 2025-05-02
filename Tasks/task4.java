public class task4 {
    

        public static int countWords(String input) {
            if (input == null || input.trim().isEmpty()) {
                return 0;
            }
    
            String[] words = input.trim().split("\\s+");
            return words.length;
        }
    
        public static void main(String[] args) {
            System.out.println(countWords("Hello world"));              
        }
    }
       

