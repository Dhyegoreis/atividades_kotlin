fun main() {
    val produto = "iMac"
    val preco = 22000.0

    if (produto == "iMac" && preco >= 10000) {
        val desconto = preco * 0.12
        val totalAPagar = preco - desconto
        println("Desconto aplicado de 12%. Total a pagar: R$ ${totalAPagar.toInt()}")
    }
}
