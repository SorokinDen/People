fun main() {
    val likes = 1021
    if ((likes - 11) % 100 == 0 )  {
        println("Понравилось " + likes + " людям")
    } else if ((likes % 10) == 1) {
        println("Понравилось " + likes + " человеку")
    } else {
        println("Понравилось " + likes + " людям")
    }
}