package lesson29.hw29.shape;

class Triangle extends Shape {

    private double a, b, c;
    private boolean isValid;

    public Triangle(double a, double b, double c) {
        if (a + b <= c && a + c <= b && c + b <= a){
            this.a = a;
            this.b = b;
            this.c = c;
            this.isValid = true;
        } else {
            this.isValid = false;
        }

    }

    @Override
    double getArrea() {
        if (!isValid) return 0;
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    double getPerimeter() {
        return isValid ? (a + b + c) : 0;
    }
}
