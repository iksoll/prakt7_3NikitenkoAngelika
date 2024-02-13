import kotlin.math.sqrt

fun main() {
    //Задание 8.1
    try {
        println("Введите коэффициенты a, b и c для уравнения y=ax^2+bx+c:")
        val a = readLine()!!.toDouble()
        val b = readLine()!!.toDouble()
        val c = readLine()!!.toDouble()
        val X = -b / (2 * a)
        val Y = a * X * X + b * X + c
        println("Вершина параболы: ($X, $Y)")
    }catch (e:Exception){println("Введены не числовые значения")}



    //Задание 18.1
    try{
        println("Введите длину стороны равностороннего треугольника:")
        val side = readLine()!!.toDouble()
        val area = (sqrt(3.0) / 4) * side * side
        val circle1 = side / (2 * sqrt(3.0))
        val circle2 = side / sqrt(3.0)
        println("Площадь треугольника: $area")
        println("Радиус вписанной окружности: $circle1")
        println("Радиус описанной окружности: $circle2")
    } catch (e:Exception){println("Введены не числовые значения")}



    //Задание 8.2
    try{
    println("Введите длины сторон треугольника:")
    val a = readLine()!!.toDouble()
    val b = readLine()!!.toDouble()
    val c = readLine()!!.toDouble()
    if (a + b > c && a + c > b && b + c > a) {
        val perimeter = a + b + c
        val p = perimeter / 2
        val area = sqrt(p * (p - a) * (p - b) * (p - c))
        println("Периметр треугольника: $perimeter")
        println("Площадь треугольника: $area")
    } else {
        println("Треугольник с такими сторонами не существует")
    }
    }catch(e:Exception){println("Введены не числовые значения")}



    //Задание 18.2
    try{
        println("Введите координаты точки М1(х1,у1):")
        val x1 =readLine()!!.toDouble()
        val y1 =readLine()!!.toDouble()
        println("Введите координаты точки M2(х2,у2):")
        val x2 =readLine()!!.toDouble()
        val y2 =readLine()!!.toDouble()
        println("Введите координаты точки N1(х3,у3):")
        val x3 =readLine()!!.toDouble()
        val y3 =readLine()!!.toDouble()
        println("Введите координаты точки N2(х4,у4):")
        val x4 =readLine()!!.toDouble()
        val y4 =readLine()!!.toDouble()
        val slope1 =(y3-y1)/(x3-x1)
        val slope2 = (y4-y2)/(x4-x2)
        when{
            (slope1==slope2)-> println("Прямые параллельны")
            else -> println ("Прямые пересекаются")
        }
    }catch (e:Exception){println("Введено не числовое значение")}

    //Задание 23
    try{
    println("Введите координаты x и y точки на плоскости:")
    val x = readLine()!!.toDouble()
    val  y = readLine()!!.toDouble()
    when{
        ((y>-1&&y<1) && (x>-3&&x<1)) -> println ("Точка принадлежит закрашенной области а")
        ((y>-2&&y<2) && (x>-1&&x<1)) -> println ("Точка принадлежит закрашенной области б")
        ((y>-1&&y<2) && (x>-1&&x<1)) -> println ("Точка принадлежит закрашенной области в")
        ((y>-2&&y<1) && (x>-2&&x<1)) -> println ("Точка принадлежит закрашенной области г")
        else -> println ("Точка не принадежит ни одной из точек")
    }
    }catch (e:Exception){println("Введено не числовое значение")}






}