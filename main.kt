// 1. O Filtro de Vogais
fun questao1() {
        val palavra = "Universidade"
            for (caractere in palavra) {
                        if (caractere.lowercaseChar() in listOf('a', 'e', 'i', 'o', 'u')) {
                                        continue
                        }
                                print(caractere)
            }
                println()
}

// 2. O Primeiro Múltiplo Comum
fun questao2() {
        var numero = 1
            while (true) {
                        if (numero % 7 == 0 && numero % 13 == 0) {
                                        println("Primeiro múltiplo comum de 7 e 13: $numero")
                                                    break
                        }
                                numero++
            }
}

// 3. Somador com Limite de Carga
fun questao3() {
        var total = 0
            for (i in 1..100) {
                        if (i % 10 == 0) {
                                        continue
                        }
                                total += i
                                        if (total > 500) {
                                                        break
                                        }
            }
                println("Valor final da soma: $total")
}

// 4. Simulador de Caixa Eletrônico
fun questao4() {
        var saldo = 1000.00
            val valorSaque = 150.00

                while (true) {
                            if (saldo >= valorSaque) {
                                            saldo -= valorSaque
                                                        println("Saque de R$ $valorSaque realizado. Saldo atual: R$ $saldo")
                            } else {
                                            println("Saldo Insuficiente")
                                                        break
                            }
                }
}

// 5. Detecção de Números Primos
fun questao5() {
        val alvo = 29
            var ehPrimo = true

                for (i in 2 until alvo) {
                            if (alvo % i == 0) {
                                            ehPrimo = false
                                                        break
                            }
                }

                    println("O número $alvo é primo? $ehPrimo")
}

// 6. O Menu Teimoso
fun questao6() {
        val entradasSimuladas = listOf(1, 3, 2, 3, 0)
            var indice = 0

                while (indice < entradasSimuladas.size) {
                            val opcao = entradasSimuladas[indice]
                                    indice++

                                            when (opcao) {
                                                            1, 2 -> println("Processando...")
                                                                        3 -> {
                                                                                            println("Módulo em manutenção")
                                                                                                            continue
                                                                        }
                                                                                    0 -> {
                                                                                                        println("Encerrando o programa...")
                                                                                                                        break
                                                                                    }
                                                                                                else -> println("Opção inválida")
                                            }
                }
}

// 7. Pula-Obstáculos Numérico
fun questao7() {// 1. O Filtro de Vogais
fun questao1() {
        val palavra = "Universidade"
            for (caractere in palavra) {
                        if (caractere.lowercaseChar() in listOf('a', 'e', 'i', 'o', 'u')) {
                                        continue
                        }
                                print(caractere)
            }
                println()
}

// 2. O Primeiro Múltiplo Comum
fun questao2() {
        var numero = 1
            while (true) {
                        if (numero % 7 == 0 && numero % 13 == 0) {
                                        println("Primeiro múltiplo comum de 7 e 13: $numero")
                                                    break
                        }
                                numero++
            }
}

// 3. Somador com Limite de Carga
fun questao3() {
        var total = 0
            for (i in 1..100) {
                        if (i % 10 == 0) {
                                        continue
                        }
                                total += i
                                        if (total > 500) {
                                                        break
                                        }
            }
                println("Valor final da soma: $total")
}

// 4. Simulador de Caixa Eletrônico
fun questao4() {
        var saldo = 1000.00
            val valorSaque = 150.00

                while (true) {
                            if (saldo >= valorSaque) {
                                            saldo -= valorSaque
                                                        println("Saque de R$ $valorSaque realizado. Saldo atual: R$ $saldo")
                            } else {
                                            println("Saldo Insuficiente")
                                                        break
                            }
                }
}

// 5. Detecção de Números Primos
fun questao5() {
        val alvo = 29
            var ehPrimo = true

                for (i in 2 until alvo) {
                            if (alvo % i == 0) {
                                            ehPrimo = false
                                                        break
                            }
                }

                    println("O número $alvo é primo? $ehPrimo")
}

// 6. O Menu Teimoso
fun questao6() {
        val entradasSimuladas = listOf(1, 3, 2, 3, 0)
            var indice = 0

                while (indice < entradasSimuladas.size) {
                            val opcao = entradasSimuladas[indice]
                                    indice++

                                            when (opcao) {
                                                            1, 2 -> println("Processando...")
                                                                        3 -> {
                                                                                            println("Módulo em manutenção")
                                                                                                            continue
                                                                        }
                                                                                    0 -> {
                                                                                                        println("Encerrando o programa...")
                                                                                                                        break
                                                                                    }
                                                                                                else -> println("Opção inválida")
                                            }
                }
}

// 7. Pula-Obstáculos Numérico
fun questao7() {
        for (numero in 1..50) {
                    if (numero % 10 == 7) {
                                    continue
                    }
                            println(numero)
        }
}

// 8. Cofre com Bloqueio Progressivo
fun questao8() {
        val senhaCorreta = "1234"
            val tentativasSimuladas = listOf("0000", "1111", "2222", "1234", "9999")

                for (tentativa in 1..5) {
                            val senhaDigitada = tentativasSimuladas[tentativa - 1]

                                    if (senhaDigitada == senhaCorreta) {
                                                    println("Acesso concedido!")
                                                                break
                                    } else {
                                                    println("Senha incorreta (tentativa $tentativa de 5).")
                                                                if (tentativa == 3) {
                                                                                    println("Cofre travado administrativamente")
                                                                                                    break
                                                                }
                                    }
                }
}

fun main() {
        println("--- Questão 1 ---")
            questao1()

                println("\n--- Questão 2 ---")
                    questao2()

                        println("\n--- Questão 3 ---")
                            questao3()

                                println("\n--- Questão 4 ---")
                                    questao4()

                                        println("\n--- Questão 5 ---")
                                            questao5()

                                                println("\n--- Questão 6 ---")
                                                    questao6()

                                                        println("\n--- Questão 7 ---")
                                                            questao7()

                                                                println("\n--- Questão 8 ---")
                                                                    questao8()
}

        for (numero in 1..50) {
                    if (numero % 10 == 7) {
                                    continue
                    }
                            println(numero)
        }
}

// 8. Cofre com Bloqueio Progressivo
fun questao8() {
        val senhaCorreta = "1234"
            val tentativasSimuladas = listOf("0000", "1111", "2222", "1234", "9999")

                for (tentativa in 1..5) {
                            val senhaDigitada = tentativasSimuladas[tentativa - 1]

                                    if (senhaDigitada == senhaCorreta) {
                                                    println("Acesso concedido!")
                                                                break
                                    } else {
                                                    println("Senha incorreta (tentativa $tentativa de 5).")
                                                                if (tentativa == 3) {
                                                                                    println("Cofre travado administrativamente")
                                                                                                    break
                                                                }
                                    }
                }
}

fun main() {
        println("--- Questão 1 ---")
            questao1()

                println("\n--- Questão 2 ---")
                    questao2()

                        println("\n--- Questão 3 ---")
                            questao3()

                                println("\n--- Questão 4 ---")
                                    questao4()

                                        println("\n--- Questão 5 ---")
                                            questao5()

                                                println("\n--- Questão 6 ---")
                                                    questao6()

                                                        println("\n--- Questão 7 ---")
                                                            questao7()

                                                                println("\n--- Questão 8 ---")
                                                                    questao8()
}

                                                                        }
                        }
            }
}