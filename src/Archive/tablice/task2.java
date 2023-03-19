package Archive.tablice;

public class task2 {
    public static void main(String[] args) {
        String[] imperium = {"AT-AT", "Trooper"};
        String[] rebelia = {"Ewok", "Millenium Falcon", "AT-AT"};
        String[] newarr = new String[imperium.length + rebelia.length];
        int a = 0;

        for (int i = 0; i < imperium.length; i++) {
            newarr[i] = imperium[i];
            a++;
        }

        for (int i = 0; i < rebelia.length; i++) {
            newarr[a] = rebelia[i];
            a++;
        }
        for (int i = 0; i < imperium.length; i++) {
            newarr[i] = imperium[i];
            a++;
        }
        for (String s : newarr) {
            System.out.println(s);
        }

        for (int i = 0; i < newarr.length; i++) {
            for (int j = i + 1; j < newarr.length; j++) {
                if (newarr[i].equals(newarr[j])) {
                    System.out.println("Powtarza sie: " + newarr[i] );
                }
            }
        }


        }
    }
