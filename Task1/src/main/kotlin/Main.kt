import kotlin.random.Random

class Car(
        val brand:String,
        val model:String,
        val power:Int,
        val torque:Int
)

class CarGenerator{

    private val brands = listOf("BMW","Mercedes-Benz","Audi","LADA","KIA","Ferrari","NISSAN",
    "Chevrolet","Acura","ЗиЛ","УАЗ","SKODA","Волга","ЗАЗ","Pagani","Dodge","TOYOTA","Mitsubishi")
    private val models = listOf("M3","Kalina","Granta","S600","Enzo","Skyline","GTR","Optima",
    "Solaris","Polo","Octavia","Rapid","Vesta","K5","Optima","Zonda","Teana","Logan","Lancer")
    fun generate(minCarCount:Int,maxCarCount:Int):List<Car> {
        val cars:MutableList<Car> = mutableListOf()
        for(i in minCarCount..maxCarCount){
            cars.add(
                    Car(
                            brands[Random.nextInt(0, brands.size - 1)],
                            models[Random.nextInt(0, models.size - 1)],
                            Random.nextInt(1,300),
                            Random.nextInt(1,450)
                    ))
        }
        return cars.toList()
    }

}

fun main(args:Array<String>){
    val carGenerator = CarGenerator()
    val cars = carGenerator.generate(3,8)
    cars.forEach { println("Brand :"+it.brand+"\n"+"Model :"+it.model+"\n"+"Power :"+it.power+"л/с\n"+"Torque :"+it.torque+"Нм\n") }
}