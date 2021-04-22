open class Animal{

    open fun dormir(){
        println("Dormir")
    }

    fun correr(){
        println("Correr")
    }
}
//Classe Cao implementando os metodos da classe animal
//java: implements
//kotlin : : (dois pontos)
class Cao : Animal() {

    //implementando o metodo abstrato da classe
    override fun dormir(){
        super.dormir()
        println("como um cao")
    }

    fun latir(){
        println("Latir")
    }

}
//Classe Passaro implementando os metodos da classe animal
class Passaro: Animal() {}

fun main(args: Array<String>) {

    val cao = Cao()
    cao.dormir()
    cao.correr()
    cao.latir()

    val passaro = Passaro()
    //passaro.dormir()

}
