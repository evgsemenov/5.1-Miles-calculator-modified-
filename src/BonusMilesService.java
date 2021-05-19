public class BonusMilesService {
    public int calculate(int cost) {
        int rublePerMile = 20;
        int miles = (cost / rublePerMile);
        return miles;
    }


}
