public class Girl {
    public static void main(String[] args) {
        Outfit outfit = OutfitFactory.getOutfit(OutfitFactory.OutfitType.BIKINI);
        outfit.wear();
    }
}
