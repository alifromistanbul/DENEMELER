package çalışmalar;

public class ChampionTeams {
    public static void main(String[] args){

        int numberOfChampionships = 0;

        boolean isChampion = numberOfChampionships>0;

        if(isChampion){
            if(numberOfChampionships>=20){
                System.out.println("Champion Galatasaray");
            }else if(numberOfChampionships<20 && numberOfChampionships>=15){
                System.out.println("Champion Fenerbahçe");
            }else if(numberOfChampionships<15 && numberOfChampionships>=10){
                System.out.println("Champion Besiktas");
            }else if(numberOfChampionships<10 && numberOfChampionships>=5){
                System.out.println("Champion Trabzon");
            }else{
                System.out.println("Champion IBB, Champion Bursaspor");
            }

        }else{
            System.out.println("Your team is not champion");
        }



    }

}
