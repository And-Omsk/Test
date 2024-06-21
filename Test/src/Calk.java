public class Calk {
    double a;
    double b;

    public  Calk( double c,double d ) {
        this.a = c;
        this.b = d;
    }
        public double slogenie ( double x, double y){
            return x + y;
        }

        public double raznost ( double x1, double y1){
            return x1 - y1;
        }
        public void delenie ( double x2, double y2){
            double del;
            del = x2 / y2;
            System.out.println("Деление  " + del);
        }
        public void umnog ( double x3, double y3){
            double umng;
            umng = x3 * y3;
            System.out.println("Умножение  " + umng);
        }

}