package com.pluralsight;

public class TestStat {
    public static void main(String[] args) {
        int [] testScores ={ 87,94,23,85,99,97,58,72,90,100};

        int sum =0;
        for (int score : testScores){
          sum +=score;
        }
        double average =(double) sum/testScores.length;

        //find high score
        int highScore =testScores[0];
        for (int score:testScores){
            if(score >highScore){
                highScore=score;
            }
        }
        int lowScore= testScores[0];
        for (int score : testScores){
            if (score<lowScore){
                lowScore=score;
            }

        }
        //median specific
        for (int i =0 ; i < testScores.length-1; i++){
            for (int j =0; j< testScores.length -1; j++){
                if (testScores[j]> testScores[j+1]){
                    //swap
                    int temp = testScores[j];
                    testScores[j]=testScores[j+1];
                    testScores[j+1]=temp;

                }
            }
        }

        double median = testScores.length %2==0 ?
                (testScores[testScores.length/2-1]+testScores[testScores.length/2])/2.0:
                testScores[testScores.length/2];
        // show
        System.out.println(" Average "+ average);
        System.out.println(" High Score "+ highScore);
        System.out.println(" Low Score : "+lowScore);
        System.out.println(" Median : "+ median);
        System.out.println(" Difference between Average and Median: "+ Math.abs(average-median));








    }

}
