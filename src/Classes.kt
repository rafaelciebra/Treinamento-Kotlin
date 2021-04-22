//Classe Casa:
class Casa {
    //Atributos
    var cor: String = ""

    //metodos
    fun abrirJanela() {
        println("Abrir janela")
    }
}
//a partir dessa casse posso criar varios onbjetos
//Função main para chamar a classe
fun main() {
//instanciar a classe
    val casa = Casa();
    casa.cor = "Amarela"

    val casa2 = Casa();
    casa2.cor = "Azul"

    //chamando o metodo da classe Casa
    casa.abrirJanela()

    println(casa.cor)
}