fun main() {
    var a = 12
    var b = 4
    var c = 3
    
    var res = f_devolverRes(a,b,c)
    
    if(res){
        println("a = b*c")
    } else {
        println("a no = b*c")
    }
    
    println(++a)
    println(a++)
    println(a)
}

fun  f_devolverRes(x: Int ,y: Int, z: Int): Boolean {
    
    var res: Boolean
    
    if(x==(y*z)){
        res = true
    } else {
        res = false
    }
    
    return res
}