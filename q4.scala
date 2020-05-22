object  q4  extends  App {

    def normal(workinghour : Double) : Double = workinghour*150
    def ot(othour : Double) : Double =  othour*75

    def income(x:Double , y:Double) : Double = normal(x) + ot(y)

    def tax(income : Double) : Double = income*0.1

  def takeHome(h1:Double,h2:Double):Double= income(h1,h2)-tax(income(h1,h2))

  print(takeHome(40,20))



}
