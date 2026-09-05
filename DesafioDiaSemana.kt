fun main() {
    print("Digite o dia (SEG, TER, QUA, QUI, SEX, SAB ou DOM): ")
    val dia = readlnOrNull()?.trim()?.uppercase()

    val fimDeSemana = dia == "SAB" || dia == "DOM"
    val diaUtil = dia == "SEG" || dia == "TER" || dia == "QUA" || dia == "QUI" || dia == "SEX"

    if (fimDeSemana) {
        println("$dia é fim de semana.")
    } else if (diaUtil) {
        println("$dia é dia útil.")
    } else {
        println("Erro: \"$dia\" não é um dia válido. Use SEG, TER, QUA, QUI, SEX, SAB ou DOM.")
    }
}
