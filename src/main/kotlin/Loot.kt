
enum class LootType{
    POTION, RING, ARMOR, NECKLACE, WEAPON
}

class Loot(val name: String, val lootType: LootType, val value: Int){

}