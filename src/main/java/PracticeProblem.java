public class PracticeProblem {

	public static void bubbleSortString(String [] strings){
        for (int i = 0; i <strings.length; i++){
            for (int j = 0; j < strings.length-1; j++){
                if (strings[j].compareToIgnoreCase(strings[j+1])>0){
                    String temp = strings [j];
                    strings [j] = strings [j+1];
                    strings [j+1] = temp;
                }
            }
        }
    }

}
