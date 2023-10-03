public class largest_string {
    
    public static void main(String[] args) {
        //creating array and store strings inside it
        String fruits[] = {"apple", "banana", "peru"};
        //considering "apple" as largest to compare with others
        String largest = fruits[0];
        for(int i = 0; i<fruits.length; i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
