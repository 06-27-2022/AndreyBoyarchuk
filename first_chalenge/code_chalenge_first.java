public class code_chalenge_first {
    public static void main (String[] args) {
        int[] arr = {95, 85, 62, 40, 79};
        String[] subjects = {"Math", "English", "Science", "History", "Art"};
        char[] gradeChar ={'A','B','C','D','F'};
        for (int g = 0; g < arr.length; g++) {

            if (arr[g] <=100 && arr[g]>=90){
                System.out.println(subjects[g]+ ": "+gradeChar[0]) ;
                }
            else if (arr[g] <=89 && arr[g]>=80){
                System.out.println(subjects[g]+ ": "+gradeChar[1]) ;
                }
            else if (arr[g] <=79 && arr[g]>=70){
                System.out.println(subjects[g]+ ": "+gradeChar[2]) ;
            }
            else if (arr[g] <=69 && arr[g]>=60){
                System.out.println(subjects[g]+ ": "+gradeChar[3]) ;
            }
            else if (arr[g] <=59 && arr[g]>=1){
                System.out.println(subjects[g]+ ": "+gradeChar[4]) ;
            }



        }
    }
}
