import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;
public class Main {
    static int found(ArrayList<String> result_new, String find){
        int number =0;
        for (String String : result_new) {
            if( String.compareTo(find) ==0){number = 1;}
        }
        return number;
    }

    static void found1(String mass1[], String mass2[], ArrayList<String> result_new){
        for(int i = 0 ;i< mass1.length; i++){
            String s = "";
            for(int j =0; j< mass2.length; j++){
                if(found(result_new, mass1[i] + mass2[j])==0){
                    result_new.add(mass1[i] + mass2[j]);
                }
            }
        }

    }
    public static void main(String args[]) {
        System.out.println("#1: Given N objects, output all combinations (order doesn’t matter) of those objects.");

        Scanner in = new Scanner(System.in);
        System.out.println("Enter lenght: ");
        int N = in.nextInt();
        String a[] = new String[N];

        for (int i=0; i<N; i++){
            System.out.println("Enter "+i+" number:");
            a[i] = in.next();
        }


        ArrayList<String> result =new ArrayList<>();
        result.add(" ");
        for(int i =0 ;i< a.length; i++){
            String s = "";
            for(int j =i ; j < a.length; j++){
                s += a[j];
                result.add(s);
            }
        }

        System.out.println(result);
        System.out.println( "////////////////////////////////////////////////////////////////////////////////////");
	    System.out. println( "You have N arrays of K elements in each.\n" +
                "\n" +
                "Please compute number of all possible pairs (orders of elements matters) of numbers from all those arrays. Note we ask for number of possible pairs, not pairs themselves.\n" +
                "\n" +
                "If successful, output possible pairs too.");
        List<String[]> listmass = new ArrayList<String[]>();
        ArrayList<String> result_new =new ArrayList<>();
        System.out.println("Enter count N objects:");
        int lenghtList = in.nextInt();
        for (int i=0; i < lenghtList; i++){
            System.out.println("Enter lenght "+ i+" objects:");
                int lenghtMass = in.nextInt();
                String temp[] = new String[lenghtMass];
                for(int j =0; j< lenghtMass; j++){
                    System.out.println("Enter "+i+" objects "+j+" element:");
                        temp[j] = in.next();
                }
                listmass.add(temp);
        }
        for(int i =0; i< listmass.size(); i++){
            for(int j =0; j< listmass.size(); j++){
                found1(listmass.get(i), listmass.get(j), result_new);
            }
        }
        Collections.sort(result_new);
        System.out.println("Number of pairs = " + result_new.size());
        System.out.println(result_new);

    }
}
