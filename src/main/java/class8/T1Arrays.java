package class8;

public class T1Arrays {
    public static void main(String[] args) {
        boolean [] conds={true,false,true,false,true,true};

        int count=0;
        int dcount=0;
        for (int i=0; i< conds.length;i++) {
            if (conds[i]){
                count++;}
            else {dcount++;
        }
        }

        System.out.println(count);
        System.out.println(dcount);

        }
    }

