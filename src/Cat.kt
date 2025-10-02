class Cat (val name: String, var age: Int, var weight: Int) {

    public fun walk(distance: Int) : Boolean
    {
        if(weight - distance >= 5) {
            weight -= distance
            return true
        }
        return false
    }

    override fun toString() : String {
        return "Name: $name Age: $age Weight: $weight"
    }
    fun eat() {
        if(weight < 20){
            weight ++
        }
        else println("$name is too full")


    }
}
