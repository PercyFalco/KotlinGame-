class Battle(val player : Player, val enemy: Enemy) {

    fun startBattle(player: Player, enemy: Enemy) {
        enemy.attack(player)
    }

}