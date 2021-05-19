public class BonusMilesService {
    public long calculate(int cost) {
        int rublePerMile = 20;
        int miles = (cost / rublePerMile);
        return miles;
    }


}
