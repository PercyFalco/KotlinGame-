//Loot Types
enum class LootType{
    POTION, RING, ARMOR, NECKLACE, WEAPON
}
//Loot Values
class Loot(val name: String, val lootType: LootType, val value: Int){

}