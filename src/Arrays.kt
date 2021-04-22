fun main() {
    //arrayOf é uma estrutura do kotlin que gera um array
    var nomes = arrayOf("Rafael", "Leticia", "Mariana")

    //posso alterar o valor de um indice já criado:
    nomes[0] = "Pedro"

    //posso criar um array para qualquer valor
    var valores = arrayOf(324, -2.3, "abc")
    //ou um array só co inteiros
    var numerosInteiros = intArrayOf(324, -23, 15436)
    //ou só com doubles
    var numerosDouble = doubleArrayOf(2.5,6.7-4.9)
    //etc




    println(nomes[0])
}