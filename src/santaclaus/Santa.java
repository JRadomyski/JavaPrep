package santaclaus;

public class Santa
        extends Osoba{
    private boolean isWorking;
    private String cityLocation;
    private String[] cityHistory = new String[1];
    private static String[] naughtyKids;
    int i =0;

    public Santa(String imie, String nazwisko, int wiek) {
        super(imie, nazwisko, wiek);
    }
    private Gift[] gifts;
    void startWork(){
        if (isWorking == true){
            System.out.println("Obecnie już jest w pracy");
        }else {
            isWorking = true;
        }
    }
    void giveGift(Child c){

    }
    void stopWork(){
        if (gifts.length>0){
            isWorking = false;
        }else{
            System.out.println("Jeszcze nie koniec pracy");
        }
    }
    void visitCity(String city){
        cityLocation = city;
        if (i < cityHistory.length){
            cityHistory[i] = city;
        }else{
            String[] cityHistory2 = new String[cityHistory.length+1];
            for (int j = 0; j< cityHistory.length; j++){
                cityHistory2[j] = cityHistory[j];
            }
            cityHistory2[i] = city;
            cityHistory = cityHistory2;
        }
    }
    Gift findHeaviest() throws noGiftsLeftException{
        int najtemp = 0;
        Gift heaviestGift = null;
        if (gifts.length == 0){
            throw new noGiftsLeftException();
        }else {
            for (int j = 0; j < gifts.length; j++) {
                if (gifts[j].weight > najtemp){
                    najtemp = gifts[j].weight;
                    heaviestGift = gifts[j];
                }
            }
        }
        return heaviestGift;
    }
    public String joke(){
        String[] jokes = {"-Kochanie, co byś powiedział, gdybyśmy wzięli ślub w Boże Narodzenie? \n" +
                "-Daj spokój! Po co mamy sobie psuć święta?", "Policjant przesłuchuje świętego Mikołaja: \n" +
                "- Co pan robił w nocy z piątego na szóstego grudnia?", "żart 3", "żart 4", "żart 5", "żart 6", "żart 7","żart 8", "żart 9", "żart 10"};
        return jokes[(int)(Math.random()*10)];
    }
}
