package cn.xpbootcamp.gilded_rose;

class GildedRose {

    Item[] items;

    final String AgedBrieName = "Aged Brie";
    final String BackStageName = "Backstage passes to a TAFKAL80ETC concert";
    final String SulfurasName = "Sulfuras, Hand of Ragnaros";

    public GildedRose(Item[] items) {
        this.items = items;
    }


    public void update_quality() {
        for (int i = 0; i < items.length; i++) {

            if(items[i].getSellIn() > 10){
                switch(items[i].getName()){
                    case SulfurasName:
                        break;
                    case AgedBrieName:
                    case BackStageName:
                        items[i].qualityIncrease();
                        break;
                    default:
                        items[i].qualityDecrease();
                }
            }
            else if(items[i].getSellIn() > 5){
                switch(items[i].getName()){
                    case SulfurasName:
                        break;
                    case AgedBrieName:
                        items[i].qualityIncrease();
                        break;
                    case BackStageName:
                        items[i].qualityIncreaseN(2);
                        break;
                    default:
                        items[i].qualityDecrease();
                }
            }
            else if(items[i].getSellIn() > 0){
                switch(items[i].getName()){
                    case SulfurasName:
                        break;
                    case AgedBrieName:
                        items[i].qualityIncrease();
                        break;
                    case BackStageName:
                        items[i].qualityIncreaseN(3);
                        break;
                    default:
                        items[i].qualityDecrease();
                }
            }
            else {
                switch(items[i].getName()){
                    case SulfurasName:
                        break;
                    case AgedBrieName:
                        items[i].qualityIncreaseN(2);
                        break;
                    case BackStageName:
                        items[i].qualityClearing();
                        break;
                    default:
                        items[i].qualityDecreaseN(2);
                }
            }

            switch(items[i].getName()){
                case SulfurasName:
                    break;
                default:
                    items[i].sellInDecrease();
            }

        }
    }
}
