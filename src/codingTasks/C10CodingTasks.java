package codingTasks;

public class C10CodingTasks {
    public static void main(String[] args) {
        String [] countries={"TURKEY","UK","ITALY","EGYPT","FRANCE","TURKEY","HUNGARY","EGYPT","UK","HOLLAND","FRANCE"};


        for (int i=0;i< countries.length;i++){
            for (int j=0;j< countries.length;j++){
                if (countries[i].equals(countries[j])&&i!=j){

                    System.out.println(countries[j]);  } }
        }



    }
}

