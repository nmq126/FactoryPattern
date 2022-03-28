public class OutfitFactory {
    private OutfitFactory(){

    }
    public static final Outfit getOutfit(OutfitType outfitType){
        switch (outfitType){
            case SHIRT:
                return new Shirt();
            case SKIRT:
                return new Skirt();
            case BIKINI:
                return new Bikini();
            default:
                throw new IllegalArgumentException("This outfit type is not supported");
        }
    }
    public enum OutfitType {

        BIKINI, SKIRT, SHIRT;

    }
}
