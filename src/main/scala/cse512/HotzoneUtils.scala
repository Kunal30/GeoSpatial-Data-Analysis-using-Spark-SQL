package cse512

object HotzoneUtils {

  def ST_Contains(queryRectangle: String, pointString: String ): Boolean = {

    val rect = queryRectangle.split(',')
    val point = pointString.split(',')

    val max_x = Math.max(rect(0).toDouble, rect(2).toDouble)
    val min_x = Math.min(rect(0).toDouble, rect(2).toDouble)

    val max_y = Math.max(rect(1).toDouble, rect(3).toDouble)
    val min_y = Math.min(rect(1).toDouble, rect(3).toDouble)

    val x = point(0).toDouble
    val y = point(1).toDouble

    if(min_x <= x && x <= max_x && min_y <= y && y <= max_y)
      return true
    else
      return false
  }

}
