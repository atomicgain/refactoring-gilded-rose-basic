package cn.xpbootcamp.gilded_rose;

public class Item {

    private String name;
    private int sellIn;
    private int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public int getSellIn(){
        return sellIn;
    }

    public int getQuality(){
        return quality;
    }

    public String getName(){
        return name;
    }

    public void qualityIncrease(){
        quality = Math.min(quality+1,50);
    }

    public void qualityDecrease(){
        quality = Math.max(quality-1,0);
    }

    public void qualityIncreaseN(int n){
        for(int i=0;i<n;i++) {
            qualityIncrease();
        }
    }

    public void qualityClearing(){
        quality = 0;
    }

    public void sellInDecrease(){
        sellIn--;
    }

    public void qualityDecreaseN(int n){
        for(int i=0;i<n;i++) {
            qualityDecrease();
        }
    }




    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
