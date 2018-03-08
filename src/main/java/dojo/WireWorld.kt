package dojo

fun animate(board: String = " "):ArrayList<String> {
    val result = ArrayList<String>()
    if(board === "H"){
        result.add(board)
        result.add("t")
        result.add(".")
    } else {
        result.add(board)
    }

    return result
}