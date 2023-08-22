fun main() {

do{
    var a: Float 
    var b: Float
    var so: Float
    var su: Float
    var mu: Float
    var di: Float
    var op: Int
    var dec: String

    do{
    println("Escolha uma opção de 1 à 4: ")
    println("1 - Soma")
    println("2 - Subtração")
    println("3 - Multiplicação")
    println("4 - Divisão")
    op = readLine().toString().toInt()

    if (op >= 5 || op <= 0)
    println ("Opção inválida!")

    }while(op >= 5 || op <= 0)

    println("Digite o primeiro número: ")
    a = readLine().toString().toFloat()

    do{
    println("Digite o segundo número: ")
    b = readLine().toString().toFloat()
    }while (a <= 0)

    if (op == 1){

        so = a + b
        println ("$a + $b = $so")

    }else{

            if(op == 2){

                su = a - b
                println ("$a - $b = $su")

            }else{

                if(op == 3){

                    mu = a * b
                    println ("$a * $b = $mu")

                }else{

                    if(op == 4){

                        di = a / b
                        println ("$a / $b = $di")

                    }else{ 
                    println ("\n")
                    }   
                }
            }
        }

        println("Deseja continuar? S/N")
        dec = readLine().toString()

}while(dec == "S" || dec == "s")

}
